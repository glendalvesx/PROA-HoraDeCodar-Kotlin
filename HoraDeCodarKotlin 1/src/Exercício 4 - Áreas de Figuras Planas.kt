import kotlin.math.PI

fun main (){

    // Calculo da área retângulo
    println("Digite um numero para base do Retângulo:")
    val base = readln().toDouble()

    println("Digite um numero para altura do Retângulo:")
    val altura = readln().toDouble()


    val area =  base * altura

    println("A área do Retângulo é: $area \n")


    // Calculo da área do quadrado
    println("Digite o primeiro número para o primeiro lado do quadrado:")
    val lado1 = readln().toDouble()

    println("Digite o segundo número para o segundo lado do quadrado: ")
    val lado2 = readln().toDouble()


    val areaQuadrado =  lado1 * lado2

    println("A área do Quadrado é: $areaQuadrado \n")


    //Calculo da área do losango
    println("Digite o número da Diagonal Maior do Losango:")
    val Dmaior = readln().toDouble()

    println("Digite o número da Diagonal Menor do Losango: ")
    val Dmenor = readln().toDouble()


    val areaLosango =  Dmaior * Dmenor / 2

    println("A área do Losango é: $areaLosango \n")


    //Calculo da área do Trapézio
    println("Digite o valor da Base Maior do Trapézio:")
    val Bmaior = readln().toDouble()

    println("Digite o valor da Base Menor do Trapézio: ")
    val Bmenor = readln().toDouble()

    println("Digite o valor da Altura do Trapézio: ")
    val Haltura = readln().toDouble()


    val areaTrapezio =  (Bmaior + Bmenor) * Haltura / 2

    println("A área do Trapézio é: $areaTrapezio \n")


    //Calculo da área do Paralelogramo
    println("Digite o número da base do Paralelogramo:")
    val base2 = readln().toDouble()

    println("Digite o número da altura do Paralelogramo: ")
    val altura2 = readln().toDouble()

    val areaParalelogramo =  base2 * altura2

    println("A área do Paralelogramo é: $areaParalelogramo \n")


    //Calculo da área do Triângulo
    println("Digite o número da base do Triângulo:")
    val base3 = readln().toDouble()

    println("Digite o número da altura do Triângulo")
    val altura3 = readln().toDouble()

    val areaTriangulo =  (base3 * altura3) / 2

    println("A área do Triângulo é: $areaTriangulo \n")


    //Calculo da área do Círculo
    println("Digite o valor do Círculo do Raio:")
    val raio = readln().toDouble()

    val areaCirculo =  PI * raio * raio

    println("A área do Círculo é: $areaCirculo \n")
}