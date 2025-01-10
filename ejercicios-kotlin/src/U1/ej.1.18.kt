
fun main () {
    val nombre_usuario = pedir_nombre()
    if (nombre_usuario != null) {
        escribir_nombre(nombre_usuario)
    } else {
        println("No se introdujo ningún nombre.")
    }
}


fun pedir_nombre(): String? {
    println("Por favor, introduce tu nombre completo: ")
    return readLine()
}

fun escribir_nombre(nombre_usuario: String) {
    val texto_minuscula = nombre_usuario.lowercase()
    println(texto_minuscula)
}