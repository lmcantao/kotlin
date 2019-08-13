package fundamentos

fun main(args: Array<String>){
    //tipos numerico Inteiros

    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2147483647
    val num4: Long = 9223272036854775807
    val num5: Long = Long.MAX_VALUE

    //Tipos Numericos reais

    val num6: Float = 3.14F
    val num7: Double = 3.14

    //Tipos Caractere

    val car: Char = '?'

    //Tipo boolean

    val bol: Boolean = true // ou false

    print(listOf(num1, num2, num3, num4, num5, num6, num7, car, bol))

    println(2 is Int)
    println(21478749834 is Long)
    println(1.0 is Double)

    //Tudo é objeto
    println(41.inc())
    println(54.dec())
}