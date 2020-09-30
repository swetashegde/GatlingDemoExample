package test.example.demo

import io.gatling.http.Predef._
import io.gatling.core.Predef._

class RunTimeParameterExampleSimulation extends Simulation{
  private def getProperty(propertyName:String, defaultValue:String): String ={
    Option(System.getenv(propertyName))
      .orElse(Option(System.getProperty(propertyName)))
      .getOrElse(defaultValue)
  }
  def UserCount: Int = getProperty("USERS", "5").toInt
  def Time: Int = getProperty("TIME", "10").toInt

  before{
    println(s"Running tests with User count = ${UserCount}")
    println(s"Time is = ${Time}")
  }

  val httpProtocol = http
    .baseUrl("https://www.demoblaze.com")
    .acceptHeader("*/*")
    .contentTypeHeader("application/json")

  val scn1 = scenario("Go to homepage")
    .exec(http("Homepage")
      .get("/")
      .check(status.is(200))
    )
  val scn2 = scenario("Go to homepage")
    .exec(http("Homepage")
      .get("/")
      .check(status.is(200))
    )

  setUp(scn1.inject(atOnceUsers(UserCount))).protocols(httpProtocol)
    .assertions(
      global.failedRequests.percent.is(0),
      forAll.responseTime.max.lte(1000))
}
//Run with mvn gatling:test -Dgatling.simulationClass=example.demo.RunTimeParameterExampleSimulation -DUSERS=10
