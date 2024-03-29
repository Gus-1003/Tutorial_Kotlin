
/*
// ESTRUTURA DA FUNÇÃO:
//A declaração de funções segue a seguinte sintaxe:

fun nomeFuncao(parametro1:Tipo,parametro2:Tipo):TipoRetorno{
  //código
  //return
} 
*/


/*
// Função sem retorno:
// Funções que não possuem retorno deve ser identificada com o tipo Unit.
// O tipo Unit pode ser omitido se função não possui retorno.

fun imprime(texto:String) {
  println(texto)
}
*/


/*
// Função de 1 linha de argumento:
// Sempre que uma função tiver apenas uma linha, não será preciso abrir e fechar as chaves {}
// Basta usar o operador de igual = e escrever tudo em uma única linha.

fun imprimeLinha(texto:String) = println(texto)
*/


/*
// Exemplo de Função:
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
