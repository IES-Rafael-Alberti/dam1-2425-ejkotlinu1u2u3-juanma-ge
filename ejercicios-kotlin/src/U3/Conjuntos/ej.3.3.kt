package U3.Conjuntos

fun <T> conjuntoPotencia(s: Set<T>): List<Set<T>> {
    val sList = s.toList()

    if (sList.isEmpty()) {
        return listOf(emptySet())
    }

    val primerElemento = sList[0]

    val subconjuntosRestantes = conjuntoPotencia(sList.drop(1).toSet())

    val nuevosSubconjuntos = mutableListOf<Set<T>>()
    for (subconjunto in subconjuntosRestantes) {
        nuevosSubconjuntos.add(subconjunto) // Agregar el subconjunto tal cual
        nuevosSubconjuntos.add(subconjunto + primerElemento) // Agregar el subconjunto con el elemento actual
    }

    return nuevosSubconjuntos
}

fun main() {
    val conjunto = setOf(6, 1, 4)
    val potencia = conjuntoPotencia(conjunto)
    println(potencia)
}