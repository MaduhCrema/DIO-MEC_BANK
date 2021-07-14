package dioOneBank.teste
import dioOneBank.Funcionario

class ImprimeRelatorio {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}