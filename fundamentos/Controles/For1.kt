package fundamentos.Controles

fun main(args: Array<String>) {
    for (i in 1..10){
        println(i)
    }
    for (i in 10 downTo 1){
        println(i)
    }

    for (i in 0..10 step 5){
        println(i)
    }

    for (i in 100 downTo 0 step 10){
        println(i)
    }
}