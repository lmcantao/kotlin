package fundamentos.operadores

data  class Carro(val marca: String, val modelo: String){

}

fun main(args: Array<String>) {
    val(marca, modelo) = Carro("Ford", "Fusion")
    println("$marca $modelo")

    val(marido, mulher) = listOf("João", "Maria")
    println("$marido e $mulher")

    val(_, _, terceiro) = listOf("Kimi", "Hamilton", "Alonso")

    println("$terceiro terminou em terceiro lugar")
}
