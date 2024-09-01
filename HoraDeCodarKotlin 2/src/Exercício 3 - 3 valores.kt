fun main(){
    println("Informe o primiero número: ")
    var numero = readln().toInt()

    println("Informe o segundo número: ")
    var numero2 = readln().toInt()

    println("Informe o terceiro número: ")
    var numero3 = readln().toInt()

    if (numero > numero2 && numero > numero3){
        println("$numero, é o maior número.")
    } else if (numero2 > numero3){
        println("$numero2, é o maior número.")
    } else {
        println("$numero3, é o maior número.")
    }
}