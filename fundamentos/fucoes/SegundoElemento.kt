package fundamentos.fucoes

fun main(args: Array<String>) {
    val lista = listOf("João", "Maria", "Pedro")
    println(lista.segundoOUNulo())

}

fun <E> List<E>.segundoOUNulo() : E? = if (this.size >= 2) this.get(1) else null