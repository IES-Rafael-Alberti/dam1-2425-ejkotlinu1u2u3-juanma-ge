package U3.Listas_Tuplas

fun sacarMaxMin(precios: List<Int>) {
    val numMax = precios.maxOrNull() ?: 0
    val numMin = precios.minOrNull() ?: 0
    println("El número más grande de la lista es el $numMax y el más pequeño es el $numMin.")
}

fun main() {
    val precios = listOf(50, 75, 46, 22, 80, 65, 8)
    sacarMaxMin(precios)
}