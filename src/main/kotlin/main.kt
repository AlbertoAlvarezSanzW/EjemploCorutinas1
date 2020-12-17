import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*
import kotlin.random.Random.Default.nextInt

fun main() {
    println("Empezamos aqui")


    for (i in 0..10) {
        GlobalScope.launch {
            println("Soy una corrutina $i y me estoy ejecutandome en 2º plano")
            delay(2000)
            println("Soy una corrutina $i y he terminado mi trabajo")
        }
    }

    println("Esperamos un rato")
    Thread.sleep(20000)
    println("Termino aqui")

}
