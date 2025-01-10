package U3.Diccionarios

import java.util.Scanner

fun agregarArticulo(cesta: MutableMap<String, Double>, scanner: Scanner) {
    print("Introduce el artículo: ")
    val articulo = scanner.nextLine()
    print("Introduce el precio de $articulo: ")
    val precio = scanner.nextDouble()
    scanner.nextLine() // Limpiar el buffer
    cesta[articulo] = precio
}

fun mostrarLista(cesta: MutableMap<String, Double>) {
    println("\nLista de la compra")
    var total = 0.0
    for ((articulo, precio) in cesta) {
        println("$articulo\t$precio")
        total += precio
    }
    println("\nTotal\t${"%.2f".format(total)}")
}

fun main() {
    val cesta = mutableMapOf<String, Double>()
    val scanner = Scanner(System.`in`)

    while (true) {
        agregarArticulo(cesta, scanner)
        print("¿Quieres añadir otro artículo? (s/n): ")
        val continuar = scanner.nextLine().lowercase()
        if (continuar != "s") {
            break
        }
    }

    mostrarLista(cesta)
}