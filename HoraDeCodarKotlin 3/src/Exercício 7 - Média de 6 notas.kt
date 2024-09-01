fun main(){

    var numero = 1
    var soma = 0.0


    while (numero <= 6) {
        println("Informe a nota $numero :")
        val nota = readln().toDouble()


        if(nota >= 0 && nota <= 10) {
            soma = soma + nota
            numero = numero + 1
        }else {
            println("Erro! Digite um nota entre 0 e 10.")
        }
    }

    var media = soma / 6
    println("A média final é: $media")
}