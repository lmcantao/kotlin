package fundamentos

fun main(args: Array<String>){
    var a: Int? = null
    println(a?.inc())

    println("Causando NullPointer")
    println(a!!.inc())
}