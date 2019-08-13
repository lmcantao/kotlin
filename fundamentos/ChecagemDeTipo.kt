package fundamentos

fun main(args: Array<String>) {
    val valor = "IFTM"

    if(valor is String){
        println(valor)
    }else if (valor !is String){
        println("Não e uma String")
    }
}