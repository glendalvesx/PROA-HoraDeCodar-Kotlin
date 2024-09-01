fun main(){
    println("Informe um número: ")
    var numero = readln().toInt()

    if(numero > 0){
        println("O número informado é positivo.")
    } else if (numero == 0){
        println("O número informado é zero.")
    } else {
        println("O número informado é negativo.")
    }
}