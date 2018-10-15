package ninjadojo

object Consecionario {
  case class TipoCarro(nombre: String, descripcion: String)
  case class PuertaCarro(color:String, peso:Int)
  case class Carro(tipo:TipoCarro, puertas:Seq[PuertaCarro], marca:String)

  def crearCarros():Carro = {
    val tipo1 = TipoCarro("volqueta", "lo más ordinario que pueda haber...")
    val puertas = PuertaCarro("rosadita", 90)
    Carro(tipo1, List(puertas), "Mazda")
  }

  def colorPuertas(): Seq[String] = {
    crearCarros().puertas.map(_.color)
  }
}
