package test.scala
import io.gatling.core.Predef._
import io.gatling.http.Predef._


class DemoExampleSimulation extends Simulation{
  //val headerset = Map("accept"-> "*/*")

  //http Protocol
  val httpProtocol = http
    .baseUrl("https://www.demoblaze.com")
    .acceptHeader("*/*")
    .contentTypeHeader("application/json")

  val login_uri="https://api.demoblaze.com"

  val feeder = csv("data/data.csv").circular
  //Scenario
  val scn = scenario("Go to homepage")
    .exec(http("Homepage")
     .get("/")
     .check(status.is(200))
    )
    .feed(feeder)
      .exec(
        http("Login to app")
          .post(login_uri+"/login")
          .body(ElFileBody("bodies/loginRequestBody.json"))
          .check(regex("""Auth_token: (.+?)""").find.saveAs("Authtoken"))
      )
      .exec{session=>println(session("Authtoken"))
        session}

  //Simulation setup
 setUp(scn.inject(atOnceUsers(2))).protocols(httpProtocol)
   .assertions(
     global.failedRequests.percent.is(0),
     forAll.responseTime.max.lte(1000)
   )
}
