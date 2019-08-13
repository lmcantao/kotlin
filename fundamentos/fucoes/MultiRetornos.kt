package fundamentos.fucoes

import java.time.Year
import java.util.*

data class Horario(val hora: Int, val minuto: Int, val segundo: Int, val diaMes: Int, val mes: Int, val ano: Int)

fun agora(): Horario {
    val agora = Calendar.getInstance()
    with(agora){
        return Horario(get(Calendar.HOUR_OF_DAY),
                get(Calendar.MINUTE),
                get(Calendar.SECOND),
                get(Calendar.DAY_OF_MONTH),
                get(Calendar.MONTH),
                get(Calendar.YEAR))
    }
}

fun main(args: Array<String>) {
    val (h, m, s, d, mm, a) = agora()
    println("$h $m $s $d $mm $a")

}