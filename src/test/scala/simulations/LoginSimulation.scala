package scala.simulations

import io.gatling.core.Predef._
import test.scala.httpconf.BaseHTTPConf
import test.scala.scenarios.LoginScenario


object LoginSimulation extends Simulation{
  val scn = LoginScenario.loginScenario
  setUp(scn.inject(atOnceUsers(2)))
    .protocols(BaseHTTPConf.httpProtocol)
    .assertions(forAll.responseTime.max.lte(2000),
      global.failedRequests.count.lt(20),
      details("Homepage").failedRequests.count.is(0))
}
