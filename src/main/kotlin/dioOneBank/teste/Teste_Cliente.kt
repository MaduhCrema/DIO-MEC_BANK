package dioOneBank.teste
import dioOneBank.Cliente
import dioOneBank.ClienteTipo
fun main(){
    val jose = Cliente("jose", "12324435",ClienteTipo.PF,"senha123")
    println(jose)

    Teste_Autenticacao().autentica(jose)
}