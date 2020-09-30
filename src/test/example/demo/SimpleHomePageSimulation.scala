package example.demo

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class SimpleHomePageSimulation extends Simulation{
  val httpProtocol = http
    .baseUrl("https://www.demoblaze.com")
    .acceptHeader("*/*")
    .contentTypeHeader("application/json")

  val scn = scenario("Go to homepage")
    .exec(http("Homepage")
      .get("/")
      .check(status.is(200))
    )

  setUp(scn.inject(atOnceUsers(1000))).protocols(httpProtocol)
    .assertions(
      global.failedRequests.percent.is(0))
}


