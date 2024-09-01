fun main(){
    var soma = 0

    println("Informe o 1° número: ")
    var numero = readln().toInt()

    println("Informe o 2° número: ")
    var numero2 = readln().toInt()

    println("Informe o 3° número: ")
    var numero3 = readln().toInt()

    println("Informe o 4° número: ")
    var numero4 = readln().toInt()

    println("Informe o 5° número: ")
    var numero5 = readln().toInt()

    println("Informe o 6° número: ")
    var numero6 = readln().toInt()

    if (numero < 72){
        soma = soma + numero
    }
    if (numero2 < 72){
        soma = soma + numero2
    }
    if (numero3 < 72){
        soma = soma + numero3
    }
    if (numero4 < 72){
        soma = soma + numero4
    }
    if (numero5 < 72){
        soma = soma + numero5
    }
    if (numero6 < 72){
        soma = soma + numero6
    }

    println("A soma dos valores inferiores ao 72 são: $soma")
}