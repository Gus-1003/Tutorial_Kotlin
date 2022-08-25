fun main() {

  // var = Variavel = Seu valor pode ser alterado
  // val = constante = Seu valor não pode ser alterado
  
  val s:Any = "Gustavo"  // Tipo Object até ser convertido para String
  
  // Lembrando: Propriedades como length só pode ser utlizado caso o tipo seja String
  
  println (s as String)
  println (s as? Int)

  // ? = cast seguro
  // as = conversor para o tipo "X"
  // $ = String templates = Substitui a variavel pelo seu valor
  
  if(s is String){ // Caso a variavel S tenha valor de String - Será considera como String a partir desse ponto
    println("$s é uma String")
  }
}
