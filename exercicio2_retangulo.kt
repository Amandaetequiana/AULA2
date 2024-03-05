package funcoes

class Retangulo(val width: Double, val height: Double) {
    fun calcularArea(): Double {
        return width * height
    }
}

fun main() {
    val retangulo = Retangulo(6.0, 5.0)
    val area = retangulo.calcularArea()
    println("A área do triângulo é: $area")
}
