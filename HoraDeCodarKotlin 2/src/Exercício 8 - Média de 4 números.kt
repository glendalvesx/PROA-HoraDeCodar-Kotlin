fun main (){
    var soma = 0
    var media = 0
    var valor = 0

    println("Informe o 1° nota: ")
    var numero = readln().toInt()

    println("Informe o 2° nota: ")
    var numero2 = readln().toInt()

    println("Informe o 3° nota: ")
    var numero3 = readln().toInt()

    println("Informe o 4° nota: ")
    var numero4 = readln().toInt()

    if (numero > 0 && numero < 10){
        valor = valor + 1
        soma = soma + numero
    }
    if (numero2 > 0 && numero2 < 10){
        valor = valor + 1
        soma = soma + numero2
    }
    if (numero3 > 0 && numero3 < 10){
        valor = valor + 1
        soma = soma + numero3
    }
    if (numero4 > 0 && numero4 < 10){
        valor = valor + 1
        soma = soma + numero4
    }

    media = soma / valor

    if (media >= 5){
        println("Você passou no teste! Sua média é: $media")
    } else{
        println("Tente novamente")
    }


}