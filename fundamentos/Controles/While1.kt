package fundamentos.Controles

fun main(args: Array<String>) {
    var opcao: Int = 0

    while (opcao != -1){
        println("Informe um número ou -1 p/ sair: ")
        val linha = readLine() ?: "0"
        opcao = linha.toIntOrNull() ?: 0

        println("Você escolheu a opção $opcao")

    }

    println("Até a próxima...")
}