package dioOneBank
class Analista(nome:String,cpf:String,salario:Double): Funcionario(nome,cpf,salario){
    override fun calculoAuxilio()= salario + (salario*0.1)
}