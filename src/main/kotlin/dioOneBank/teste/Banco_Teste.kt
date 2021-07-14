package dioOneBank.teste

import dioOneBank.Banco

fun main(){
    val dioOneBank = Banco(nome = "One Bank",numero = 13)
    println("Nome = ${dioOneBank.nome}")
    println("Número = ${dioOneBank.numero}")

    val Banco02 = dioOneBank.copy(nome = "One Bank 2")
    println(Banco02.info())
}