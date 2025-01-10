fun main() {
    val precio = preguntar_precio()
    if (precio != null) {
        val redondeado = "%.2f".format(precio).toFloat()
        extraer_euros_centimos(redondeado)
    } else {
        println("Entrada inválida. Por favor, introduce un número válido.")
    }
}

fun preguntar_precio(): Float? {
    println("Introduce un precio con dos decimales: ")
    return readLine()?.toFloatOrNull()
}

fun extraer_euros_centimos(redondeado: Float) {
    val euros = redondeado.toInt()
    val centimos = ((redondeado - euros) * 100).toInt()
    println("Son $euros euros y $centimos céntimos.")
}