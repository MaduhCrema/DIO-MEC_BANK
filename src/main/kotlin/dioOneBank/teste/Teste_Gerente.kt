package dioOneBank.teste
import dioOneBank.Gerente

fun main(){
    val teste = Gerente("maria","834565432",545.90, "duda123")
    ImprimeRelatorio.imprime(teste)
    Teste_Autenticacao().autentica(teste)
}
