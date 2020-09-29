package test.scala.queries

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object LoginQuery {
  val loginUrl = "https://api.demoblaze.com"
  val feeder = csv("data/data.csv").circular
  val loginQuery = feed(feeder)
      .exec(
      http("Login to app")
        .post(loginUrl+"/login")
        .body(ElFileBody("bodies/loginRequestBody.json"))
        .check(status.in(200 to 210))
        .check(regex("""Auth_token: (.+?)""").find.saveAs("Authtoken"))
    )
    .exec{session=>println(session("Authtoken").as[String])
      session}

}
