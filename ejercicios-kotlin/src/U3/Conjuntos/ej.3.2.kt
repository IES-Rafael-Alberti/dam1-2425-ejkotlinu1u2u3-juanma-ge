package U3.Conjuntos

fun obtenerNombresNivel(nivel: String): List<String> {
    val nombres = mutableListOf<String>()
    println("Introduce los nombres de los alumnos de $nivel. Escribe 'x' para terminar.")

    while (true) {
        print("Introduce un nombre: ")
        val nombre = readLine()?.trim() ?: ""
        if (nombre.lowercase() == "x") {
            break
        }
        nombres.add(nombre)
    }
    return nombres
}

fun mostrarNombresUnicos(primaria: List<String>, secundaria: List<String>) {
    val todosLosNombres = (primaria + secundaria).toSet()
    println("\nNombres de todos los alumnos (sin repeticiones):")
    println(todosLosNombres)
}

fun mostrarNombresRepetidos(primaria: List<String>, secundaria: List<String>) {
    val repetidos = primaria.toSet().intersect(secundaria.toSet())
    println("\nNombres que se repiten entre primaria y secundaria:")
    println(repetidos)
}

fun mostrarNombresUnicosPrimaria(primaria: List<String>, secundaria: List<String>) {
    val unicosPrimaria = primaria.toSet() - secundaria.toSet()
    println("\nNombres de primaria que no se repiten en secundaria:")
    println(unicosPrimaria)
}

fun verificarSiPrimariaEstaEnSecundaria(primaria: List<String>, secundaria: List<String>) {
    val primariaSet = primaria.toSet()
    val secundariaSet = secundaria.toSet()

    if (primariaSet.all { it in secundariaSet }) {
        println("\nTodos los nombres de primaria están incluidos en secundaria.")
    } else {
        println("\nNo todos los nombres de primaria están incluidos en secundaria.")
    }
}

fun main() {
    val primaria = obtenerNombresNivel("primaria")
    val secundaria = obtenerNombresNivel("secundaria")

    mostrarNombresUnicos(primaria, secundaria)
    mostrarNombresRepetidos(primaria, secundaria)
    mostrarNombresUnicosPrimaria(primaria, secundaria)
    verificarSiPrimariaEstaEnSecundaria(primaria, secundaria)
}