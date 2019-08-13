package fundamentos.fucoes

fun min2 (a: Int, b: Int): Int = if(a < b) a else b

fun main(args: Array<String>) {
    print("O menor valor é ${min(3, 4)}")

    println("O menor valor é ${min2(3, 4)}")
}

fun min (a: Int, b: Int): Int{
    return if(a < b) a else b

}



