package fundamentos.Controles

fun main(args: Array<String>) {
    val alunos = arrayListOf("Juliana", "Andressa", "Claudia")

    for ((indice, aluno) in alunos.withIndex()){
        println("$indice = $aluno")
    }
}