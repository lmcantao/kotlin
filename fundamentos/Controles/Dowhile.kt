package fundamentos.Controles

fun main(args: Array<String>) {
    var opcao: Int

    do{
        println("Informe um valor ou -1 pra sair: ")
        val linha = readLine() ?: "0"
        opcao = linha.toIntOrNull() ?: 0
        println("Voce escolheu a opcao $opcao")
    }while (opcao != -1)
    println("Até a proxima...")
}