fun main(){

    var planetas = listOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")

    println("Informe o nome do planeta: ")
    val planeta: String = readln()

    if (planetas.contains(planeta)){
        println("Este planeta está na lista.")
    }else{
        println("Este planeta não está na lista")
    }
}