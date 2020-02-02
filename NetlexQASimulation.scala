
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class NetlexQASimulaton extends Simulation {

	val httpProtocol = http
		.baseUrl("https://letsbomfin.github.io/cadastro.github.io/#paralogin")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList("""https://letsbomfin.github.io/cadastro.github.io/#paralogin"""))
		
	val headers_0 = Map(
		"cache-control" -> "max-age=0",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "cross-site",
		"sec-fetch-user" -> "?1")



	val scn = scenario("NetlexQASimulaton")
		.exec(http("Login Application")
			.get("/")
			.headers(headers_0))

	setUp(scn.inject(atOnceUsers(5))).protocols(httpProtocol)
}