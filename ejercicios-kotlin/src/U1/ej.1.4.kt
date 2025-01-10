fun main (){
    println("Introduce una temperatura en grados Celsius: ")
    val temperatura = readLine()?.toFloatOrNull()
    if (temperatura != null) {
        operacion(temperatura)
    } else {
        println("Entrada inválida. Por favor, introduce un número válido.")
    }
}

fun operacion (temperatura: Float) {
    val temperatura_en_celsius = ((temperatura * 9) / 5) + 32
    println("La temperatura en Farenherit es de $temperatura_en_celsius")
}

