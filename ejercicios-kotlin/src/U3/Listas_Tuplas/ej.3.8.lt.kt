package U3.Listas_Tuplas

fun pedirPalabra(): String {
    print("Introduce una palabra: ")
    return readLine() ?: ""
}

fun verificarPalindromo(palabra: String) {
    if (palabra == palabra.reversed()) {
        println("La palabra es un palíndromo.")
    } else {
        println("La palabra no es un palíndromo.")
    }
}

fun main() {
    val palabra = pedirPalabra()
    verificarPalindromo(palabra)
}