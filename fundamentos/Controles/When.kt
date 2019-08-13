package fundamentos.Controles

fun main(args: Array<String>) {
    val nota = 8.7

    when(nota){
        in 9..10 -> println("Fantástico!")
        in 7..8 -> println("Parabéns")
        in 4..6 -> println("Tem como rec..")
        in 0..3 -> println("Nota inválida")
    }
}