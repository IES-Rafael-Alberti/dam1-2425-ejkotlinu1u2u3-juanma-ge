package U2.Excepciones

fun pedirNum(): Int {
    while (true) {
        try {
            print("Introduce tu edad: ")
            val num = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Entrada no válida")
            if (num < 1) {
                println("El número debe ser un número positivo.")
            } else {
                return num
            }
        } catch (e: Exception) {
            println("Por favor, ingrese un número entero válido.")
        }
    }
}

fun verImpares(num: Int) {
    val impares = (1..num step 2).map { it.toString() }
    println(impares.joinToString(", "))
}

fun main() {
    val num = pedirNum()
    verImpares(num)
}