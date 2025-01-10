package U2.Excepciones

fun preguntarNum(): Int {
    while (true) {
        try {
            print("Introduce un número entero positivo: ")
            val num = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Entrada no válida")
            if (num < 0) {
                println("El número debe ser positivo.")
            } else {
                return num
            }
        } catch (e: Exception) {
            println("Por favor, ingrese un número entero válido.")
        }
    }
}

fun cuentaAtras(num: Int) {
    val cuenta = (num downTo 0).map { it.toString() }
    println(cuenta.joinToString(", "))
}

fun main() {
    val num = preguntarNum()
    println("Cuenta atrás:")
    cuentaAtras(num)
}