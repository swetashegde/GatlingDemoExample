package scala.simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class DemoAgainSimulation extends Simulation{
val httpProtocolEntry = http
  .baseUrl("https://api.demoblaze.com")
  .acceptHeader("*/*")


  val entryScenario = scenario("Get entry demo")
    .exec(http("entry").get("/entries").check(status.is(200)))

  setUp(entryScenario.inject(atOnceUsers(2)))
    .protocols(httpProtocolEntry)
    .assertions(
      global.failedRequests.count.lt(10),
      forAll.responseTime.max.lte(2000),
      details("entry").failedRequests.count.is(0)
    )

}
