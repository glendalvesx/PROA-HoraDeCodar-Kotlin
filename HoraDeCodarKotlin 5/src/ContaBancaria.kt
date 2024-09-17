import java.util.*
import kotlin.system.exitProcess
import kotlin.math.*

var saldo = 100.5 // Float

fun main() {
    inicio()
}

fun inicio() {

    println("Informe o seu nome para acessar sua conta: ")
    var nome = readln().toString()
    println("Olá $nome, é um prazer ter você por aqui!")

    println("Escolha uma opção:")
    println("1 - Ver saldo")
    println("2 - Ver Extrato")
    println("3 - Fazer saque")
    println("4 - Fazer depósito")
    println("5 - Fazer transferência")
    println("6 - Sair")

    val escolha = readLine()?.toIntOrNull()

    when (escolha) {
        1 -> verSaldo()
        2 -> verExtrato()
        3 -> fazerSaque()
        4 -> fazerDeposito()
        5 -> fazerTransferencia()
        6 -> sair(nome)
        else -> erro()
    }
}

fun verSaldo() {
    val senhaValida = 3589

    println("Para ver seu saldo, por favor digite sua senha: ")
    var senha = readln().toInt()

    if (senha == senhaValida){
        println("Seu saldo atual é: R$$saldo \n")
        inicio()
    }else{
        println("Senha inválida.")
        verSaldo()
    }
}

fun verExtrato(){
    val senhaValida = 3589

    println("Para ver o extrato, por favor digite sua senha: ")
    var senha = readln().toInt()

    if (senha == senhaValida){
        println("EXTRATO: ")
        println("Uber         | R$50,00")
        println("Pag Boleto   | R$180,00")
        println("Compra Gás   | R$90,00")
        println("Hipermercado | R$200,00")
        println("Depósito     | R$520,00")
        inicio()
    }else{
        println("Senha inválida.")
        verExtrato()
    }

}

fun fazerSaque() {
    val senhaValida = 3589

    println("Para realizar o saque, por favor digite sua senha: ")
    var senha = readln().toInt()

    if (senha == senhaValida) {
        println("Qual o valor para saque? ")
        val saque = readln().toFloatOrNull()

        if (saque == null || saque <= 0) {
            println("Por favor, informe um número válido.")
            fazerSaque()
        } else if (saque > saldo) {
            println("Operação não autorizada. Saldo insuficiente.")
            verSaldo()
        } else {
            saldo -= saque
            println("Saque de $saque realizado com sucesso.")
            inicio()
        }
    } else {
        println("Senha inválida.")
        fazerSaque()
    }
}

fun fazerDeposito() {
    val senhaValida = 3589

    println("Para realizar o depósito, por favor digite sua senha: ")
    var senha = readln().toInt()

    if (senha == senhaValida) {
        println("Digite o valor do depósito: ")
        val deposito = readln().toFloatOrNull()

        if (deposito == null || deposito <= 0) {
            println("Operação não autorizada. Por favor, informe um valor maior que zero.")
            fazerDeposito()
        } else {
            saldo = saldo + deposito
            println("Depósito de $deposito realizado com sucesso!")
            verSaldo()
            inicio()
        }
    } else {
        println("Senha inválida.")
        fazerDeposito()
    }
}
fun fazerTransferencia() {
    val senhaValida = 3589

    println("Para realizar a transferência, por favor digite sua senha: ")
    val senha = readln().toIntOrNull()

    if (senha == senhaValida) {
        println("Informe o número da conta para transferência: ")
        val conta = readln().toIntOrNull()

        if (conta == null) {
            println("Operação não autorizada. Número da conta válido.")
            fazerTransferencia()
        }

        println("Digite o valor da transferência: ")
        val transferencia = readln().toFloatOrNull()

        if (transferencia == null || transferencia <= 0) {
            println("Operação não autorizada. O valor deve ser maior que zero.")
            fazerTransferencia()
        } else if (transferencia > saldo) {
            println("Operação não autorizada. Saldo insuficiente.")
            inicio()
        } else {
            saldo -= transferencia
            println("Transferência de $transferencia para a conta $conta realizada com sucesso.")
            inicio()
        }
    } else {
        println("Senha incorreta. Tente novamente.")
        fazerTransferencia()
    }
}

fun erro() {
    println("Por favor, informe um número entre 1 e 6.")
    inicio()
}

fun sair(nome: String) {
    println("$nome, foi um prazer ter você por aqui!")
    exitProcess(0)
}

