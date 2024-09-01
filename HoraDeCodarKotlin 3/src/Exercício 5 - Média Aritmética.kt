fun main(){
    println("Informe o primiero número: ")
    var numero = readln().toInt()

    println("Informe o segundo número: ")
    var numero2 = readln().toInt()

    if (numero < numero2){
        var soma = 0
        var resultado = 0
        var i = numero

        while (i <=numero2){
            soma = soma + i
            resultado = resultado + 1
            i = i + 1
        }

        var media = soma / resultado
        println("A média aritmética é: $media")
    }
    else{
        println("Erro: O primeiro número deve ser menor que o segundo número.")
    }



}