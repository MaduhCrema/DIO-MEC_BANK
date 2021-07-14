package dioOneBank

//herda as informações de pessoas
abstract class Funcionario(nome:String, cpf:String, val salario:Double): Pessoa(nome,cpf) {
    // apenas a classe funcionario e suas filhas usem a fun
    protected abstract fun calculoAuxilio(): Double

  override fun toString():String = """
        nome: $nome
        cpf: $cpf
        Saláro: $salario
        Auxílio: ${calculoAuxilio()}    
    """.trimIndent()
}