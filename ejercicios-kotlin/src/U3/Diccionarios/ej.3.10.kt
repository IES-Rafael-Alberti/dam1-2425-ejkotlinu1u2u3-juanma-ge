package U3.Diccionarios

fun añadirCliente(clientes: MutableMap<String, MutableMap<String, Any>>) {
    print("Introduce el NIF del cliente: ")
    val nif = readLine()?.trim() ?: ""
    print("Introduce el nombre del cliente: ")
    val nombre = readLine()?.trim() ?: ""
    print("Introduce la dirección del cliente: ")
    val direccion = readLine()?.trim() ?: ""
    print("Introduce el teléfono del cliente: ")
    val telefono = readLine()?.trim() ?: ""
    print("Introduce el correo del cliente: ")
    val correo = readLine()?.trim() ?: ""
    print("¿Es cliente preferente? (sí/no): ")
    val preferente = (readLine()?.trim()?.lowercase() == "sí")

    val cliente = mutableMapOf(
        "nombre" to nombre,
        "dirección" to direccion,
        "teléfono" to telefono,
        "correo" to correo,
        "preferente" to preferente
    )

    clientes[nif] = cliente
    println("Cliente $nombre añadido correctamente.\n")
}

fun eliminarCliente(clientes: MutableMap<String, MutableMap<String, Any>>) {
    print("Introduce el NIF del cliente a eliminar: ")
    val nif = readLine()?.trim() ?: ""
    if (clientes.containsKey(nif)) {
        clientes.remove(nif)
        println("Cliente eliminado correctamente.\n")
    } else {
        println("No se encontró el cliente con ese NIF.\n")
    }
}

fun mostrarCliente(clientes: MutableMap<String, MutableMap<String, Any>>) {
    print("Introduce el NIF del cliente: ")
    val nif = readLine()?.trim() ?: ""
    val cliente = clientes[nif]
    if (cliente != null) {
        println("\nDatos del cliente ${cliente["nombre"]}:")
        println("NIF: $nif")
        println("Dirección: ${cliente["dirección"]}")
        println("Teléfono: ${cliente["teléfono"]}")
        println("Correo: ${cliente["correo"]}")
        println("Preferente: ${if (cliente["preferente"] as Boolean) "Sí" else "No"}\n")
    } else {
        println("No se encontró el cliente con ese NIF.\n")
    }
}

fun listarTodosClientes(clientes: MutableMap<String, MutableMap<String, Any>>) {
    if (clientes.isEmpty()) {
        println("No hay clientes registrados.\n")
    } else {
        println("\nLista de todos los clientes:")
        clientes.forEach { (nif, cliente) ->
            println("NIF: $nif, Nombre: ${cliente["nombre"]}")
        }
        println()
    }
}

fun listarClientesPreferentes(clientes: MutableMap<String, MutableMap<String, Any>>) {
    val preferentes = clientes.values.filter { it["preferente"] as Boolean }
    if (preferentes.isEmpty()) {
        println("No hay clientes preferentes.\n")
    } else {
        println("\nLista de clientes preferentes:")
        preferentes.forEach { cliente ->
            println("Nombre: ${cliente["nombre"]}")
        }
        println()
    }
}

fun main() {
    val clientes = mutableMapOf<String, MutableMap<String, Any>>()

    while (true) {
        println("Menú:")
        println("1. Añadir cliente")
        println("2. Eliminar cliente")
        println("3. Mostrar cliente")
        println("4. Listar todos los clientes")
        println("5. Listar clientes preferentes")
        println("6. Terminar")

        print("Elige una opción (1-6): ")
        val opcion = readLine()?.trim() ?: ""

        when (opcion) {
            "1" -> añadirCliente(clientes)
            "2" -> eliminarCliente(clientes)
            "3" -> mostrarCliente(clientes)
            "4" -> listarTodosClientes(clientes)
            "5" -> listarClientesPreferentes(clientes)
            "6" -> {
                println("Terminando el programa.")
                break
            }
            else -> println("Opción no válida. Por favor, elige una opción entre 1 y 6.\n")
        }
    }
}