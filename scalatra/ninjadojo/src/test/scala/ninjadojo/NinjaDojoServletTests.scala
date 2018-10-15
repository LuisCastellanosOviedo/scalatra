package ninjadojo

import org.scalatra.test.scalatest._

class NinjaDojoServletTests extends ScalatraFunSuite {

  addServlet(classOf[NinjaDojoServlet], "/*")

  test("GET / on NinjaDojoServlet should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
