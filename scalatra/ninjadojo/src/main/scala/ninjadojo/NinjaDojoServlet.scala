package ninjadojo

import org.scalatra._

class NinjaDojoServlet extends ScalatraServlet {

  get("/") {
    "<h1>Hptas</h1>"
  }

  get("/puertas") {
    Consecionario.colorPuertas()
  }

}
