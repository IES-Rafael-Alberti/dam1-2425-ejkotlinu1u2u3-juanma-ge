package U3.Conjuntos

fun obtenerConsonantes(vocales: Set<Char>): Set<Char> {
    val alfabeto = ('a'..'z').toSet() // Generar el alfabeto como un conjunto
    val consonantes = alfabeto - vocales
    return consonantes
}

fun obtenerLetrasComunes(vocales: Set<Char>, consonantes: Set<Char>): Set<Char> {
    return vocales intersect consonantes
}

fun main() {
    val vocales = setOf('a', 'e', 'i', 'o', 'u') // Conjunto de vocales
    val consonantes = obtenerConsonantes(vocales)
    val letrasComunes = obtenerLetrasComunes(vocales, consonantes)

    println("Conjunto de vocales: $vocales")
    println("Conjunto de consonantes: $consonantes")
    println("Conjunto de letras comunes: $letrasComunes")
}