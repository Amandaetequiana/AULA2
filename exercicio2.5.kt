package funcoes

inline fun <T> executarCOmLog(nomeFuncao: String, funcao: () -> T): T {
    println("Entrando no método $nomeFuncao...")
    try {
        return funcao()
    } finally {
        println("Método $nomeFuncao finalizado...")
    }
}

fun somar(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    val resultado = executarCOmLog("somar") {
        somar(4, 5)
    }

    println(resultado)
}