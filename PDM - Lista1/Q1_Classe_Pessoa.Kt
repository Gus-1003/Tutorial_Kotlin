open class Pessoa(val nome:String, val altura:Float){
    var idade:Int
    var anoNascimento:Int
    
    init{
        this.idade = 0
        this.anoNascimento = 2022
    }
    
    constructor(nome:String, anoNascimento:Int, altura:Float) : this(nome, altura){
        this.idade = calculadora()
    }
    
    override fun toString() = "$nome ($anoNascimento, $altura)"
    
     
    fun calculadora() = 2022 - this.anoNascimento  // Se não tipificar não tem return
	
    fun calculadora2():Int {
        return 2022 - this.anoNascimento
    }
}


class Funcionario(val salario:Float, nome:String, altura:Float):Pessoa(nome,altura){
    
    override fun toString() = "$nome ($salario)"
    
}

class Agenda(){
    
    var pessoas = arrayOfNulls<Pessoa>(10)
    
    
    fun armazenarPessoa(p:Pessoa){ //Cadastrar
        for(i in pessoas.indices){
            if(pessoas[i] == null){
                pessoas[i] = p
                return
            }
        }
    }
    
    fun removerPessoa(nome:String){ //Remover
        for(i in pessoas.indices){
            if(pessoas[i]?.nome == nome){
                pessoas[i] = null
                return
            }
        }
    }
    
    fun buscaPessoa(nome:String):Pessoa?{ //Buscar pelo nome
        for(i in pessoas.indices){
            if(pessoas[i]?.nome == nome){
                return pessoas[i]
            }
        }
        return null
    }
    
    fun printPessoa(indice:Int){ //Buscar pelo indice
        println(pessoas[indice]?.toString())
        //println(pessoas.getOrnull(indice))
    }
    
    fun printAgenda(){ //Lista Geral
        for(p:Pessoa? in pessoas){
            println(p.toString())
        }
    }
    
}

fun main() {
    
    var Gustavo:Pessoa
    println("Rôdo")
    
}
