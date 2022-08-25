/*
class = Palavra reservada = Inicializa uma classe

Toda classe extende do tipo object

No Kotlin o construtor padrão é declarado na mesma linha da classe (Parametros).
*/

// Forma Java de escrever uma classe:
class Carro (nome:String, ano:Int){// Passagem de valores por argumentos

  // Atributos da classe:
  val nome:String
  val ano:Int
  
  // Quando existe passagem de valores por parametros o Init (construtor) deve ser criado;
  init{ // Construtor
    this.nome = nome
    this.ano = ano
  }

  // Método
  override fun toString() = "Carro $nome ($ano)"
}

// Forma Kotlin de escrever uma classe:
class Moto (val nome:String, val ano:Int){ // Parametro = Construtor -> Exige a declaração das palavra-reervadas val ou var.
  // Método
  override fun toString() = "Moto $nome ($ano)"
}

fun main() {
  // Instanciação do Objeto:
  var c1:Carro
  var M1:Moto 
  
  // Passagem de valores por parametros:
  c1 = Carro("Corsa", 1999)
  M1 = Moto("Fenix", 2015)
 
  println(c1)
  println(c1.nome)

  println(M1)
  println(M1.nome)
}
