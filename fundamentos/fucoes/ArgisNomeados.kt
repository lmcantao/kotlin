package fundamentos.fucoes

fun main(args: Array<String>) {
    println(relTrabalho("João", "Maria"))
    println(relTrabalho(funcio = "João", chefe = "Maria"))
    println(relTrabalho(chefe = "Maria",  funcio = "João"))
}

fun relTrabalho(chefe: String, funcio: String): String{
    return "$funcio é subordinado(a) à $chefe"
}