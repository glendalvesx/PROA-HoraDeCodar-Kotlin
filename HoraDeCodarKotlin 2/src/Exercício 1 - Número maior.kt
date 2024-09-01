fun main(){
    println("Informe o primeiro número: ")
    var numero = readln().toInt()

    println("Informe o segundo número: ")
    var numero2 = readln().toInt()

    if(numero > numero2){
        println("O maior número é: $numero")
    }else {
        println("O maior número é: $numero2")
    }
}