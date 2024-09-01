fun main (){
    var aprovados = 0

    while (true){
        println("Informe a primeira nota: ")
        var nota1 = readln().toDouble()

        println("Informe a segunda nota: ")
        var nota2 = readln().toDouble()

        var media = (nota1 + nota2) / 2

        if (media >= 9.5){
            println("Parabéns! Você foi aprovado. Sua média é: $media")
            aprovados = aprovados + 1
        }
        else{
            println("Você não foi aprovado. Sua média é: $media")
        }

        println("Deseja calcular a média de outro aluno? Informe: Sim ou Nao: ")
        var resposta = readln()

        if (resposta == "Não" || resposta == "Nao"){
            println("A quantidade de alunos aprovados são: $aprovados")
            break
        }
    }
}