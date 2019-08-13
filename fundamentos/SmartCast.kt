package fundamentos

fun main(args: Array<String>) {
    esperto1("Ola")
    esperto1(9)

    esperto2("IFTM")
    esperto2(7)
    esperto2(true)
}

fun esperto1(x: Any){

    if(x is String){
        println(x.toUpperCase())
    }else if(x is Int){
        println(x.plus(3))
    }
}


fun esperto2(x: Any){

   when(x){
       is String -> println(x.toUpperCase())
       is Int -> println(x.plus(3))
       else -> println("Nada...")
   }
}