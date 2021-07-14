package dioOneBank.teste
import dioOneBank.ClienteTipo
fun main(){
    // pega a função enum os seus valores. para cada elemento nele ...
    ClienteTipo.values().forEach{ elemento ->
        println(" ${elemento.name} = ${elemento.descricao}")
    }
}