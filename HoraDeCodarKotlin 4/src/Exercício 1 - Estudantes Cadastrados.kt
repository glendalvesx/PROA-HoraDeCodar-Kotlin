fun main(){

    var contador = 0

    while (true){
        println("Digite o nome do estudante: ")
        var nome = readln()
        contador = contador + 1

        if (nome == "PARE"){
            println("A quantidade de estudantes cadastrados é: $contador")
            return
        }
    }
}