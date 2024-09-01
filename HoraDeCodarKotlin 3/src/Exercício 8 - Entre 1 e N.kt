fun main(){

    println("Informe um número: ")
    var numero = readln().toInt()

    if (numero > 0){
        var i = 1

        while (i <= numero){
            println(i)
            i = i + 1
        }

    }
    else {
        println("O número deve ser maior que ZERO. Tente novamente.")
    }
}