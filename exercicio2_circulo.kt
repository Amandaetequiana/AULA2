package funcoes

 abstract class Forma {
    abstract fun calcularArea(): Double
 }

class Circulo(private val radius: Double) : Forma() {
    override fun calcularArea(): Double {
        return Math.PI * radius * radius
    }
}

fun main() {
    val circulo = Circulo(2.0)
    val circuloArea = circulo.calcularArea()
    println("A área do circulo é: $circuloArea")
}