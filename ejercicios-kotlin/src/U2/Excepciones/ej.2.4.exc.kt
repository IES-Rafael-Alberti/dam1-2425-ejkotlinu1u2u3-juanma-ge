package U2.Excepciones

fun solicitarNumero(): Int {
    while (true) {
        try {
            print("Introduce un número entero: ")
            val num = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Entrada no válida")
            return num
        } catch (e: Exception) {
            println("La entrada no es correcta. Por favor, ingrese un número entero.")
        }
    }
}

fun mostrarNumero(num: Int) {
    println("Has introducido el número: $num")
}

fun main() {
    val num = solicitarNumero()
    mostrarNumero(num)
}