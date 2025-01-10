fun main () {
    val lista_con_comas = pedir_lista()
    if (lista_con_comas != null) {
        lista_nueva(lista_con_comas)
    } else {
        println("Entrada inválida. Por favor, introduce una válida.")
    }
}

fun pedir_lista (): String? {
    println("Introduce la lista de la compra con los productos separados por comas: ")
    return readLine()
}

fun lista_nueva (lista_con_comas: String) {
    val productos = lista_con_comas.split(",").map { it.trim() }
    println("Los productos de la lista son:")
    for (producto in productos) {
        println(producto)
    }
}

