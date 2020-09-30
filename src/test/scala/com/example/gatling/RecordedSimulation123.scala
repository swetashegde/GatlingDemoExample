package com.example.gatling

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation123 extends Simulation {

	val httpProtocol = http
		.baseUrl("https://api.demoblaze.com")
		.inferHtmlResources()
		.acceptHeader("image/avif,image/webp,image/apng,image/*,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.4183.121 Safari/537.36")
  	.silentResources

	val headers_0 = Map(
		"accept" -> "*/*",
		"access-control-request-headers" -> "content-type",
		"access-control-request-method" -> "POST",
		"origin" -> "https://www.demoblaze.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_1 = Map(
		"accept" -> "*/*",
		"content-type" -> "application/json",
		"origin" -> "https://www.demoblaze.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_2 = Map(
		"if-none-match" -> "TTo8pA",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_7 = Map(
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_8 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"if-none-match" -> "TTo8pA",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1")

	val headers_9 = Map(
		"accept" -> "*/*",
		"if-none-match" -> "TTo8pA",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_20 = Map(
		"accept" -> "*/*",
		"if-none-match" -> "TTo8pA",
		"origin" -> "https://www.demoblaze.com",
		"sec-fetch-dest" -> "font",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_21 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"if-none-match" -> "TTo8pA",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_22 = Map(
		"accept" -> "*/*",
		"origin" -> "https://www.demoblaze.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_23 = Map(
		"accept" -> "*/*",
		"if-modified-since" -> "Fri, 13 Sep 2019 14:27:35 GMT",
		"if-none-match" -> "3d072b9847e24d317ce99e262de5bb94",
		"origin" -> "https://www.demoblaze.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_24 = Map(
		"accept" -> "*/*",
		"if-modified-since" -> "Fri, 13 Sep 2019 14:27:34 GMT",
		"if-none-match" -> "91c66e59d98212c729d67453d1e403ad",
		"origin" -> "https://www.demoblaze.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

    val uri1 = "https://hls.demoblaze.com"
    val uri3 = "https://www.demoblaze.com"

	val scn = scenario("RecordedSimulation123")
		.exec(http("request_0")
			.options("/bycat")
			.headers(headers_0)
			.resources(http("request_1")
			.post("/bycat")
			.headers(headers_1)
			.body(RawFileBody("com/example/gatling/recordedsimulation123/0001_request.json")),
            http("request_2")
			.get(uri3 + "/imgs/xperia_z5.jpg")
			.headers(headers_2),
            http("request_3")
			.get(uri3 + "/imgs/galaxy_s6.jpg")
			.headers(headers_2),
            http("request_4")
			.get(uri3 + "/imgs/Lumia_1520.jpg")
			.headers(headers_2),
            http("request_5")
			.get(uri3 + "/imgs/iphone_6.jpg")
			.headers(headers_2),
            http("request_6")
			.get(uri3 + "/imgs/HTC_M9.jpg")
			.headers(headers_2),
            http("request_7")
			.get(uri3 + "/imgs/Nexus_6.jpg")
			.headers(headers_7)))
		.pause(588)
		.exec(http("request_8")
			.get(uri3 + "/index.html")
			.headers(headers_8)
			.resources(http("request_9")
			.get(uri3 + "/js/index.js")
			.headers(headers_9),
            http("request_10")
			.get(uri3 + "/bm.png")
			.headers(headers_2),
            http("request_11")
			.get(uri3 + "/node_modules/video.js/dist/video.min.js")
			.headers(headers_9),
            http("request_12")
			.get(uri3 + "/nexus1.jpg")
			.headers(headers_2),
            http("request_13")
			.get(uri3 + "/node_modules/bootstrap/dist/js/bootstrap.min.js")
			.headers(headers_9),
            http("request_14")
			.get(uri3 + "/node_modules/tether/dist/js/tether.min.js")
			.headers(headers_9),
            http("request_15")
			.get(uri3 + "/iphone1.jpg")
			.headers(headers_2),
            http("request_16")
			.get(uri3 + "/Samsung1.jpg")
			.headers(headers_2),
            http("request_17")
			.get(uri3 + "/node_modules/videojs-contrib-hls/dist/videojs-contrib-hls.min.js")
			.headers(headers_9),
            http("request_18")
			.get(uri3 + "/node_modules/jquery/dist/jquery.min.js")
			.headers(headers_9),
            http("request_19")
			.get(uri3 + "/imgs/front.jpg")
			.headers(headers_2),
            http("request_20")
			.get(uri3 + "/css/fonts/Lato-Regular.woff2")
			.headers(headers_20),
            http("request_21")
			.get(uri3 + "/config.json")
			.headers(headers_21),
            http("request_22")
			.get("/entries")
			.headers(headers_22),
            http("request_23")
			.get(uri1 + "/index.m3u8")
			.headers(headers_23),
            http("request_24")
			.get(uri1 + "/about_demo_hls_600k.m3u8")
			.headers(headers_24),
            http("request_25")
			.get(uri3 + "/imgs/Lumia_1520.jpg")
			.headers(headers_2),
            http("request_26")
			.get(uri3 + "/imgs/galaxy_s6.jpg")
			.headers(headers_2),
            http("request_27")
			.get(uri3 + "/imgs/xperia_z5.jpg")
			.headers(headers_2),
            http("request_28")
			.get(uri3 + "/imgs/HTC_M9.jpg")
			.headers(headers_2),
            http("request_29")
			.get(uri3 + "/imgs/iphone_6.jpg")
			.headers(headers_2),
            http("request_30")
			.get(uri3 + "/imgs/Nexus_6.jpg")
			.headers(headers_2),
            http("request_31")
			.get(uri3 + "/imgs/sony_vaio_5.jpg")
			.headers(headers_2),
            http("request_32")
			.get(uri1 + "/about_demo_hls_600k00000.ts")
			.headers(headers_22),
            http("request_33")
			.options("/bycat")
			.headers(headers_0),
            http("request_34")
			.post("/bycat")
			.headers(headers_1)
			.body(RawFileBody("com/example/gatling/recordedsimulation123/0034_request.json"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}