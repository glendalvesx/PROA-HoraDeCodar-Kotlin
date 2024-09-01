fun main(){

    var resultado = 0.0

    println("Informe o 1° número: ")
    var numero = readln().toDouble()

    println("Informe o 2° número: ")
    var numero2 = readln().toDouble()

    println("Digite uma opção (1. Adição, 2. Subtração, 3. Divisão e 4. Multiplicação: ")
    val operacao = readln().toInt()

    if (operacao == 1){
        resultado = numero + numero2
        println("A adição dos dois números informados é: $resultado")
    }
    else if (operacao == 2){
        resultado = numero - numero2
        println("A subtração dos dois números informados é: $resultado")
    }
    else if (operacao == 3){
        resultado = numero / numero2
        println("A divisão dos dois números informados é: $resultado")
    }
    else if (operacao == 4){
        resultado = numero * numero2
        println("A multiplicação dos dois números informados é: $resultado")
    }else{
        println("ERRO! Operação inválida. Digite 1, 2, 3 ou 4.")
    }

}