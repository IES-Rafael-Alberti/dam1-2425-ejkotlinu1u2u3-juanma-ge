package U2.Condicionales

fun pedirSexo(): String {
    print("Introduce tu sexo (femenino/masculino): ")
    return readLine()?.lowercase() ?: error("Entrada inválida")
}

fun pedirNombre(): String {
    print("Introduce tu nombre: ")
    return readLine()?.lowercase() ?: error("Entrada inválida")
}

fun compararNombreSexo(nombre: String, sexo: String): String {
    val primeraLetra = nombre.firstOrNull() ?: error("El nombre no puede estar vacío")
    val nAscii = primeraLetra.code

    return if (sexo == "femenino") {
        if (nAscii < 77) "A" else "B"
    } else if (sexo == "masculino") {
        if (nAscii > 77) "A" else "B"
    } else {
        error("Sexo inválido. Debe ser 'femenino' o 'masculino'.")
    }
}

fun main() {
    val sexo = pedirSexo()
    val nombre = pedirNombre()
    val grupo = compararNombreSexo(nombre, sexo)
    println("Perteneces a la clase $grupo")
}
