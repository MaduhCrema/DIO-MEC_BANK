package dioOneBank

class Gerente(nome:String,cpf:String,salario:Double, val senha:String): Funcionario(nome = nome,cpf = cpf,salario = salario), Logavel{
    override fun calculoAuxilio(): Double = salario + (salario*0.4)
    override fun login():Boolean = "duda123" == senha
}