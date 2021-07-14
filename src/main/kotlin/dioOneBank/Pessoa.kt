package dioOneBank
/**open class Pessoa (open val nome:String,
                   open val cpf:String)

    private set colocar embaixo da variavel que eu não quero que possa modificar
    classe dentro de uma classe,
    inner class Endereco{
    var rua: String = "Rua Alves"
    }

fun PessoaInfo() = "$ nome e $cpf"

/fun main(){
    val teste = Pessoa()
    teste.nome = "joao"

    println(teste.nome)
    println(teste.cpf)
    println(teste.Endereco().rua)
    print(teste.PessoaInfo())
}**/

abstract  class Pessoa (val nome:String,
                        val cpf:String){}
