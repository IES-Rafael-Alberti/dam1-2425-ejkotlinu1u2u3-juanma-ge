package U2.Iterativas

fun preguntarNumero(): Int {
    print("Introduce un número entero positivo (-1 para terminar): ")
    return readLine()?.toIntOrNull() ?: -1
}

fun sumaDigitos(numero: Int): Int {
    return numero.toString().map { it.toString().toInt() }.sum()
}

fun esPar(numero: Int): Boolean {
    return numero % 2 == 0
}

fun main() {
    var contadorPares = 0

    while (true) {
        val num = preguntarNumero()

        if (num == -1) {
            break
        }

        if (num > 0) {
            println(num)
            if (esPar(num)) {
                contadorPares++
            }
        }
    }
    println(contadorPares)
}