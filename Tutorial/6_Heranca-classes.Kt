/*
open = Palavra reservada = Inicializa uma classe ou método os possibilitando ter suas caracteristicas herdadas
*/

// Classe Base:
open class Veiculo (val nome:String, val ano:Int){ 
  
  open fun acelerar(velocidade:Int):Unit{ 
    println("vruuuummm")
  }
  
}

// Classe Derivada:
class Moto (val cilindradas:Int, nome:String, ano:Int) : Veiculo (nome, ano){
  
  var retrovisor = 0
  
  constructor (cilindradas:Int, nome:String, ano:Int, retro:Int):this(cilindradas, nome, ano){
    this.retrovisor = retro
  }
  
  override fun acelerar(velocidade:Int):Unit{
    println("vruuuummm")
  }
}

// Classe Principal:
fun main() {
  var M1:Moto
  
  M1 = Moto(150, "Fenix", 2015)

  M1.acelerar(100)
}
