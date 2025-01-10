fun main () {
    val numero = pedir_numero()
    if (numero != null) {
        escribir_nombre(numero)
    } else {
        println("No se introdujo ningún nombre.")
    }
}

fun pedir_numero (): String? {
    println("Introduce un número de teléfono en el formato +34-prefijo-numero-extension:")
    return readLine()
}

fun extraer_numero (numero: String) {
    "val numero_usuario = texto.substring(4, 13)"
}