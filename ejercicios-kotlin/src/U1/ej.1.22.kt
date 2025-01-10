fun main() {
    val frase = preguntar_frase()
    val vocal = pedir_vocal()
    if (frase != null && vocal != null ) {
        modificar_frase(frase, vocal)
    } else {
        println("Entrada inválida. Por favor, introduce opciones válidas.")
    }
}

fun preguntar_frase(): String? {
    println("Introduce una frase a su elección: ")
    return readLine()
}

fun pedir_vocal(): String? {
    println("Introduce una vocal: ")
    return readLine()?.lowercase()
}

fun modificar_frase(frase: String, vocal: String) {
    val fraseModificada = frase.replace(vocal, vocal.uppercase(), ignoreCase = true)
    println("La frase modificada sería $fraseModificada.")
}