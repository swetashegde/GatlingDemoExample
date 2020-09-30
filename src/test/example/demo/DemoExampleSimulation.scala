package test.example.demo

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration.DurationInt

class DemoExampleSimulation extends Simulation{
  val httpProtocol = http
    .baseUrl("https://www.demoblaze.com")
    .acceptHeader("*/*")
    .contentTypeHeader("application/json")

  val login_uri="https://api.demoblaze.com"

  val feeder = csv("data/data.csv").circular

  val scn = scenario("Go to homepage")
    .exec(http("Homepage")
     .get("/")
     .check(status.in(200 to 210))
    )
    .pause(1)
    .feed(feeder)
      .exec(
        http("Login to app")
          .post(login_uri+"/login")
          .body(ElFileBody("bodies/loginRequestBody.json"))
          .check(status.is(200))
          .check(regex("""Auth_token: (.+?)""").find.saveAs("AuthToken"))
      )
      .exec{session=>println(session("AuthToken").as[String])
        session}
      .pause(1, 20)
      .pause(1000.milliseconds, 2000.milliseconds)

 setUp(scn.inject(atOnceUsers(10))).protocols(httpProtocol)
   .assertions(
     global.failedRequests.percent.is(0)
   )
}
