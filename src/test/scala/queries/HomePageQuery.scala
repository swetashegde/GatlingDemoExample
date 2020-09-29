package test.scala.queries

import io.gatling.http.Predef._
import io.gatling.core.Predef._

object HomePageQuery {
  val getHomePage = exec(http("Homepage")
    .get("/")
    .check(status.is(200)))
}
