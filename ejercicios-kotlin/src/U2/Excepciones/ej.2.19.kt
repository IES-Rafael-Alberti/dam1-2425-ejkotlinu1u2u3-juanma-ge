package U2.Excepciones

fun mostrarMenu() {
    println("\nMenú de opciones:")
    println("1 - Comenzar programa")
    println("2 - Imprimir listado")
    println("3 - Finalizar programa")
}

fun ejecutarOpcion(opcion: Int) {
    when (opcion) {
        1 -> println("Comenzando el programa...")
        2 -> println("Imprimiendo el listado...")
        3 -> println("Finalizando el programa...")
        else -> println("Opción incorrecta, por favor elige una opción válida.")
    }
}

fun main() {
    while (true) {
        mostrarMenu()
        print("Selecciona una opción (1, 2 o 3): ")
        val opcion = readLine()?.toIntOrNull() ?: 0

        if (opcion == 3) {
            ejecutarOpcion(opcion)
            break // Finaliza el bucle si se elige la opción 3
        } else {
            ejecutarOpcion(opcion)
        }
    }
}