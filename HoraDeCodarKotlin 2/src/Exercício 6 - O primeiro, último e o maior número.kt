fun main(){
    var maior = 0

    println("Informe o 1° número: ")
    var numero = readln().toInt()

    println("Informe o 2° número: ")
    var numero2 = readln().toInt()

    println("Informe o 3° número: ")
    var numero3 = readln().toInt()

    println("Informe o 4° número: ")
    var numero4 = readln().toInt()

    maior = numero

    if (numero2 > maior) {
        maior = numero2
    }
    if (numero3 > maior){
        maior = numero3
    }
    if (numero4 > maior){
        maior = numero4
    }

    println("O 1° número é: $numero")
    println("O Último número é: $numero4")
    println("O número maior é: $maior")




}