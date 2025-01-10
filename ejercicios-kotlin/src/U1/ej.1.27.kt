package U1

fun main() {
    val nombre = pedir_nombre_producto()
    val precio = pedir_precio_producto()
    val unidades = pedir_numero_unidades()

    if (nombre != null && precio != null && unidades != null) {
        mostrar_resumen(nombre, precio, unidades)
    } else {
        println("Entrada inválida. Por favor, introduce opciones válidas.")
    }
}

fun pedir_nombre_producto(): String? {
    println("Introduce el nombre del producto:")
    return readLine()?.takeIf { it.isNotEmpty() }
}

fun pedir_precio_producto(): Double? {
    println("Introduce el precio unitario del producto:")
    return readLine()?.toDoubleOrNull()
}

fun pedir_numero_unidades(): Int? {
    println("Introduce el número de unidades:")
    return readLine()?.toIntOrNull()
}

fun mostrar_resumen(nombre: String, precio: Double, unidades: Int) {
    val costeTotal = precio * unidades
    val resultado = """
        Producto: $nombre
        Precio unitario: ${"%06.2f".format(precio)}
        Unidades: ${"%03d".format(unidades)}
        Coste total: ${"%08.2f".format(costeTotal)}
    """.trimIndent()
    println(resultado)
}