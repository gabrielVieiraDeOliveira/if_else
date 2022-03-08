fun main() {
    //atividade1()
    atividade2()
}

fun atividade1() : Unit{
    println("Digite O Ano Desejado:")
    val ano = readLine()!!.toInt()
    if (ano % 4 == 0)
        println("ano Bissexto")
    else
        println("Ano normal")
}

fun atividade2(): Unit{
    println("Telefonou para a vítima?")
    var resposta = readLine()!!
    println("Esteve no local do crime?")
    resposta = readLine()!!
    println("Mora perto da vítima?")
    resposta = readLine()!!
    println("Devia para a vítima?")
    resposta = readLine()!!
    println("Já trabalhou com a vítima?")
    resposta = readLine()!!
    resposta.toInt()
    val positivo = false
    val negativo:Boolean = false
    if (resposta.equals("sim", true))
        positivo
    else if (resposta.equals("não", true))
        negativo
    else
        println("Digite uma resposta válida")

    if (positivo.toString() == 5.toString())
        println("Assassina")
    else if (positivo.toString() >= 3.toString())
        println("cúmplice")
    else if (positivo.toString() == 2.toString())
        println("Suspeita")
    else
        println("inocente")
}
