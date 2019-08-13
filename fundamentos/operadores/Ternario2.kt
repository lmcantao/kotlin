package fundamentos.operadores

fun obteerResultado(nota: Double): String
    =if(nota >= 7.0 )"Passou" else "Reprovou"

fun main(args: Array<String>) {
    print(obteerResultado(8.3))
}