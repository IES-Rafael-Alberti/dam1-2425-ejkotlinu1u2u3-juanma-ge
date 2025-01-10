package U3.Listas_Tuplas

fun preguntarPalabra(): String {
    print("Introduce una palabra: ")
    return readLine() ?: ""
}

fun vocalRepeticion(palabra: String) {
    val vocales = mutableMapOf('a' to 0, 'e' to 0, 'i' to 0, 'o' to 0, 'u' to 0)
    for (letra in palabra.lowercase()) {
        if (letra in vocales) {
            vocales[letra] = vocales[letra]?.plus(1) ?: 0
        }
    }
    println(vocales)
}

fun main() {
    val palabra = preguntarPalabra()
    vocalRepeticion(palabra)
}