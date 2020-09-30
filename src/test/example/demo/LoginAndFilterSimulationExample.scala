package example.demo

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

class LoginAndFilterSimulationExample extends Simulation{
  val feeder = csv("data/data.csv").circular
  val apiUrl = "https://api.demoblaze.com"

  val httpProtocol = http
    .baseUrl("https://www.demoblaze.com")
    .acceptHeader("*/*")
    .contentTypeHeader("application/json")

  val loginScenario = scenario("Login Scenario")
    .exec(getHomePage())
    .pause(2)
    .exec(loginToApp())
    .pause(2,10)

  val viewNoteBookCategoryScenario = scenario("view Notebook category scenario")
    .exec(getHomePage())
    .pause(2000.milliseconds)
    .exec(viewNoteBookCategory())
    .pause(2000.milliseconds, 4000.milliseconds)

  def getHomePage() = {
    exec(http("Homepage")
      .get("/")
      .check(status.is(200)))
  }

  def loginToApp() = {
    feed(feeder)
      .exec(
        http("Login to app")
          .post(apiUrl+"/login")
          .body(ElFileBody("bodies/loginRequestBody.json"))
          .check(status.in(200 to 210))
          .check(regex("""Auth_token: (.+?)""").find.saveAs("Authtoken"))
      )
      .exec{session=>println(session("Authtoken").as[String])
        session}
  }

  def viewNoteBookCategory() = {
    exec(
      http("Get Products by category")
        .post(apiUrl+"/bycat")
        .body(StringBody("{\"cat\":\"notebook\"}"))
        .check(status.is(200))
    )
      .pause(2)
  }

  setUp(loginScenario.inject(atOnceUsers(10)).protocols(httpProtocol),
    viewNoteBookCategoryScenario.inject(rampUsersPerSec(10) to 20 during (2 minutes)))
    .protocols(httpProtocol)
    .assertions(
      global.failedRequests.count.lte(10),
      forAll.responseTime.max.lte(3000),
      details("Homepage").failedRequests.count.is(0)
    )
}
