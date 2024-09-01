fun main (){
    var soma = 0

    println("Informe o primeiro número: ")
    var numero = readln().toInt()

    println("Informe o segundo número: ")
    var numero2 = readln().toInt()

    println("Informe o terceiro número: ")
    var numero3 = readln().toInt()

    if (numero > numero2 && numero3 > numero2){
        soma = numero + numero3
        println("A soma dos dois números maiores é: $soma")
    } else if (numero2 > numero && numero3 > numero ){
        soma = numero2 + numero3
        println("A soma dos dois números maiores é: $soma")
    } else {
        soma = numero2 + numero
        println("A soma dos dois números maiores é: $soma")
    }
}