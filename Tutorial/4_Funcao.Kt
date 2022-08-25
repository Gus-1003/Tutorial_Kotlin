/*
//A declaração de funções segue a seguinte sintaxe:

fun nomeFuncao(parametro1:Tipo,parametro2:Tipo):TipoRetorno{
  //código
  //return
} 
*/

/*
fun parOuImpar(i : Int): String{
  return (if (i % 2 == 0) "par" else "impar")
}
fun main() {
  println(parOuImpar(1))
  println(parOuImpar(2))
}
*/

fun enviarEmail(usuario:String, titulo:String?=null):String{
  val s = titulo?: "Bem-vindo"
  
  // ?: -> Operador ternário e Elvis
  // “Se o valor da variável não for nulo, use seu próprio valor; caso contrário use outro.”
  
  return "$s $usuario"
}

fun main() {
  println(enviarEmail("Gustavo"))
  println(enviarEmail("Gustavo", "Welcome"))
}
