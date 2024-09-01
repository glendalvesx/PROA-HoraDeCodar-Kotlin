fun main(){
    var soma = 0
    var media = 0

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

    soma = (numero + numero2 + numero3 + numero4 + numero5 + numero6)
    media = (soma / 6)

    println("A média aritmética dos números informados são: $media")


}