package fundamentos.Controles

fun main(args: Array<String>) {
    val nota = 7

    when(nota){
         10, 9 -> println("Fantástico!")
         8, 7 -> println("Parabéns")
         6, 5, 4 -> println("Tem como rec..")
        3, 2, 1, 0 -> println("Nota inválida")
        else -> println("Nota inválida")
    }
}