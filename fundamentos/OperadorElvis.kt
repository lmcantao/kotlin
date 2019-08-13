package fundamentos

fun main(args:Array<String>){
    var opcional: String? = null
    opcional = "kotlin"
    val obrigatorio: String = opcional ?: "Valor padrão"

    println(obrigatorio)
}