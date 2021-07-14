package dioOneBank

class Cliente(nome:String,cpf:String,val clienteTipo: ClienteTipo, val senha:String): Pessoa(nome,cpf), Logavel{
    override fun login(): Boolean = "senha123" == senha

    override fun toString(): String = """
        nome: $nome
        cpf: $cpf
        tipo: ${clienteTipo.descricao}
    """.trimIndent()
}