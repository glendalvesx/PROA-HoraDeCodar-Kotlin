fun main (){

    var valorDentro = 0
    var valorFora = 0
    var i = 1

    while (i <= 10){
        println("Informe um valor $i:")
        val valor = readln().toInt()

    if(valor >= 24 && valor <= 42){
        valorDentro = valorDentro + 1
    }else{
        valorFora = valorFora + 1
    }
        i = i + 1
    }

    println("A quantidade de valores dentro do intervalor de 24, 42 é: $valorDentro")
    println("A quantidade de valores fora do intervalo de 24, 42 é: $valorFora")
}