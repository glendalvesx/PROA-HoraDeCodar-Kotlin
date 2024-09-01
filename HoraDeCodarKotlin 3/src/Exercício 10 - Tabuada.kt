fun main(){

    var tabuada = 1
    var contador = 0

    println("Informe um número: ")
    var numero = readln().toInt()

    while (tabuada <= numero){
        println("A tabuada do $tabuada: ")

        contador = 1

        while (contador <= 10){
            println("$tabuada x $contador = ${tabuada * contador}")
            contador = contador + 1
        }

        tabuada = tabuada + 1

    }
}