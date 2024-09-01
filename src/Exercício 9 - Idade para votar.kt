fun main(){
    var ano = 2024
    var idade = 0

    println("Digite o ano que você nasceu: ")
    var anoNascimento = readln().toInt()

    idade = ano - anoNascimento

    if(idade >= 16){
        println("Você tem idade para votar!")
    }else {
        println("Você ainda não tem idade para votar esse ano.")
    }
}