fun main(){
    var pesoIdeal = 0.0

    println("Informe sua altura: ")
    var altura = readln().toDouble()

    println("Informe o seu gênero (Digite 1 para Feminino e 2 para Masculino: ")
    var genero = readln().toInt()


    if (genero == 1){
        pesoIdeal = (62.1 * altura) - 44.7
    }
    if (genero == 2){
        pesoIdeal = (72.7 * altura) - 58
    }

    println("O peso ideal é: $pesoIdeal, kg")
}