fun main () {
    val frase = pedir_frase()
    val frase_invertida = frase?.reversed()
    println(frase_invertida)
}

fun pedir_frase (): String? {
    println("Introduce una frase para que se te devuelva invertida: ")
    return readLine()
}
