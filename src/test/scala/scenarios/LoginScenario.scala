package test.scala.scenarios

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import test.scala.queries.{HomePageQuery, LoginQuery}

object LoginScenario {
  val loginScenario = scenario("Login Scenario")
    .exec(HomePageQuery.getHomePage)
    .pause(2)
    .exec(LoginQuery.loginQuery)
    .pause(2)
}
