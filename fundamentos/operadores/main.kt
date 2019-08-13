package fundamentos.operadores

import java.util.*

fun main(args: Array<String>) {
    println("Banana" === "Banana")
    println(3 !==2)
    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)

    val d1 = Date(0)
    val d2 = Date(0)

    println("Reslutado com '===' ${d1 === d2}")

    println("Resultado com '==' ${d1 == d2}")
    println(d1?.equals(d2) ?: (d2 === null))

    println(d1)
}