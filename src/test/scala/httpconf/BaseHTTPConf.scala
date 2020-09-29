package test.scala.httpconf

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object BaseHTTPConf {
  val httpProtocol = http
    .baseUrl("https://www.demoblaze.com")
    .acceptHeader("*/*")
    .contentTypeHeader("application/json")
}
