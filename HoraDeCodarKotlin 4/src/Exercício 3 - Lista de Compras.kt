fun main() {

    val listaFrutas = mutableListOf("Melancia", "Manga", "Morango", "Maçã", "Mamão")

    while (listaFrutas.isNotEmpty()) {
        println("Frutas disponíveis: $listaFrutas")
        println("Informe o nome da fruta para ser removida da lista: ")
        val fruta = readln()

        if (fruta in listaFrutas) {
            listaFrutas.remove(fruta)
            println("A fruta foi retirada da lista.")
        } else {
            println("A fruta informada está indisponível nesse mercado")
        }
    }

    println("Lista de compras encerrada.")

}

