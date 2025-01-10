package U2.Excepciones

fun obtenerFrase(): String {

    print("Por favor, ingrese una frase: ")
    return readLine().orEmpty()
}

fun contarPalabras(frase: String): Pair<Int, List<String>> {

    val palabras = frase.split(" ").filter { it.isNotEmpty() }
    return Pair(palabras.size, palabras)
}

fun encontrarPalabraMasLarga(palabras: List<String>): String? {

    return if (palabras.isEmpty()) null else palabras.maxByOrNull { it.length }
}

fun main() {

    val frase = obtenerFrase()
    val (cantidadPalabras, palabras) = contarPalabras(frase)
    val palabraMasLarga = encontrarPalabraMasLarga(palabras)

}