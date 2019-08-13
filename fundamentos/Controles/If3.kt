package fundamentos.Controles

fun main(args: Array<String>) {
    val nota: Double = 8.5

    if(nota in 9..10){
        println("Fantśtico")

    }else if( nota in 7..8){
        println("Parabéns!")
    }else if(nota in 4..6){
        println("Tem como recuperar")
    }else if(nota in 0..3){
        println("Até o proximo semestre...")
    }else{
        println("Nota inválida")
    }
}