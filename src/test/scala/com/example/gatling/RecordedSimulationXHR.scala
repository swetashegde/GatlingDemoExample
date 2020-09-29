package com.example.gatling

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulationXHR extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.demoblaze.com")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.4183.102 Safari/537.36")
  	.silentResources

	val headers_0 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1")

	val headers_1 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"if-none-match" -> "TTo8pA",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_4 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"if-none-match" -> "TTo8pA",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_8 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_9 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"if-none-match" -> "TTo8pA",
		"origin" -> "https://www.demoblaze.com",
		"sec-fetch-dest" -> "font",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_10 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"if-none-match" -> "TTo8pA",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_14 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"access-control-request-headers" -> "content-type",
		"access-control-request-method" -> "POST",
		"origin" -> "https://www.demoblaze.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_15 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "application/json",
		"origin" -> "https://www.demoblaze.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_20 = Map(
		"accept" -> "text/css,*/*;q=0.1",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-fetch-dest" -> "style",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_22 = Map(
		"accept" -> "text/css,*/*;q=0.1",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"if-none-match" -> "TTo8pA",
		"sec-fetch-dest" -> "style",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

    val uri1 = "https://hls.demoblaze.com"
    val uri2 = "https://api.demoblaze.com"

	val scn = scenario("RecordedSimulationXHR")
		.exec(http("request_0")
			.get("/prod.html?idp_=1")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/node_modules/jquery/dist/jquery.min.js")
			.headers(headers_1),
            http("request_2")
			.get("/node_modules/tether/dist/js/tether.min.js")
			.headers(headers_1),
            http("request_3")
			.get("/node_modules/video.js/dist/video.min.js")
			.headers(headers_1),
            http("request_4")
			.get("/bm.png")
			.headers(headers_4),
            http("request_5")
			.get("/node_modules/videojs-contrib-hls/dist/videojs-contrib-hls.min.js")
			.headers(headers_1),
            http("request_6")
			.get("/imgs/front.jpg")
			.headers(headers_4),
            http("request_7")
			.get("/node_modules/bootstrap/dist/js/bootstrap.min.js")
			.headers(headers_1),
            http("request_8")
			.get("/js/prod.js")
			.headers(headers_8),
            http("request_9")
			.get("/css/fonts/Lato-Regular.woff2")
			.headers(headers_9),
            http("request_10")
			.get("/config.json")
			.headers(headers_10),
            http("request_11")
			.get(uri1 + "/index.m3u8"),
            http("request_12")
			.get(uri1 + "/about_demo_hls_600k.m3u8"),
            http("request_13")
			.get(uri1 + "/about_demo_hls_600k00000.ts"),
            http("request_14")
			.options(uri2 + "/view")
			.headers(headers_14),
            http("request_15")
			.post(uri2 + "/view")
			.headers(headers_15)
			.body(RawFileBody("com/example/gatling/recordedsimulationxhr/0015_request.json")),
            http("request_16")
			.get("/imgs/galaxy_s6.jpg")
			.headers(headers_4)))
		.pause(1)
		.exec(http("request_17")
			.options(uri2 + "/addtocart")
			.headers(headers_14)
			.resources(http("request_18")
			.post(uri2 + "/addtocart")
			.headers(headers_15)
			.body(RawFileBody("com/example/gatling/recordedsimulationxhr/0018_request.json"))))
		.pause(88)
		.exec(http("request_19")
			.get("/cart.html")
			.headers(headers_0)
			.resources(http("request_20")
			.get("/node_modules/bootstrap-sweetalert/dist/sweetalert.css")
			.headers(headers_20),
            http("request_21")
			.get("/node_modules/jquery/dist/jquery.min.js")
			.headers(headers_1),
            http("request_22")
			.get("/node_modules/bootstrap/dist/css/bootstrap.min.css")
			.headers(headers_22),
            http("request_23")
			.get("/node_modules/video.js/dist/video-js.min.css")
			.headers(headers_22),
            http("request_24")
			.get("/css/latofonts.css")
			.headers(headers_22),
            http("request_25")
			.get("/css/latostyle.css")
			.headers(headers_22),
            http("request_26")
			.get("/node_modules/video.js/dist/video.min.js")
			.headers(headers_1),
            http("request_27")
			.get("/node_modules/bootstrap-sweetalert/dist/sweetalert.min.js")
			.headers(headers_8),
            http("request_28")
			.get("/node_modules/bootstrap/dist/js/bootstrap.min.js")
			.headers(headers_1),
            http("request_29")
			.get("/bm.png")
			.headers(headers_4),
            http("request_30")
			.get("/node_modules/videojs-contrib-hls/dist/videojs-contrib-hls.min.js")
			.headers(headers_1),
            http("request_31")
			.get("/js/cart.js")
			.headers(headers_8),
            http("request_32")
			.get("/node_modules/tether/dist/js/tether.min.js")
			.headers(headers_1),
            http("request_33")
			.get("/imgs/front.jpg")
			.headers(headers_4),
            http("request_34")
			.get("/css/fonts/Lato-Regular.woff2")
			.headers(headers_9),
            http("request_35")
			.get("/config.json")
			.headers(headers_10),
            http("request_36")
			.get(uri1 + "/index.m3u8"),
            http("request_37")
			.get(uri1 + "/about_demo_hls_600k.m3u8"),
            http("request_38")
			.get(uri1 + "/about_demo_hls_600k00000.ts"),
            http("request_39")
			.options(uri2 + "/viewcart")
			.headers(headers_14),
            http("request_40")
			.post(uri2 + "/viewcart")
			.headers(headers_15)
			.body(RawFileBody("com/example/gatling/recordedsimulationxhr/0040_request.json")),
            http("request_41")
			.options(uri2 + "/view")
			.headers(headers_14),
            http("request_42")
			.post(uri2 + "/view")
			.headers(headers_15)
			.body(RawFileBody("com/example/gatling/recordedsimulationxhr/0042_request.json")),
            http("request_43")
			.get("/imgs/galaxy_s6.jpg")
			.headers(headers_4)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}