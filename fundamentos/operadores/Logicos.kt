package fundamentos.operadores

import sun.font.TrueTypeFont

fun main(args: Array<String>) {
    val trabalhou1: Boolean = true
    val trabalhou2: Boolean = true

    val comprouSorvete = trabalhou1 || trabalhou2
    val comprouTv50 = trabalhou1 && trabalhou2
    val comprouTv32 = trabalhou1 xor trabalhou2

    println(comprouSorvete)
    println(comprouTv50)
    println(comprouTv32)


}