fun main (){
    println("Informe um número: ")
    var numero = readln().toInt()

    println("Informe o segundo número: ")
    var numero2 = readln().toInt()

    while (numero2 <= 0){
        println("Número não aceito. Por favor, informe um número que seja positivo e maior que zero: ")
        numero2 = readln().toInt()
    }

    if (numero2 > 0){
        var resultado = (numero / numero2)
        println("O resultado da divisão dos dois números é: $resultado")
    }
}