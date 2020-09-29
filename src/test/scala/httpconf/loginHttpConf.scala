package scala.httpconf

import io.gatling.http.Predef._
import io.gatling.core.Predef._

object loginHttpConf {
  val loginHttpProtocol = http
    .baseUrl("https://api.demoblaze.com")
    .acceptHeader("*/*")
    .contentTypeHeader("application/json")
}
