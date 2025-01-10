package U2.Condicionales

fun pedirContrasena(): String {
    print("Introduce tu contraseña: ")
    return readLine().orEmpty()
}

fun pedirContrasena2(): String {
    print("Introduce de nuevo tu contraseña: ")
    return readLine().orEmpty()
}

fun compararContrasenas(contrasena1: String, contrasena2: String): String {
    return if (contrasena1.equals(contrasena2, ignoreCase = true)) {
        "Ambas contraseñas coinciden."
    } else {
        "Las contraseñas no coinciden."
    }
}

fun main() {
    val contrasena1 = pedirContrasena()
    val contrasena2 = pedirContrasena2()
    val comprobacion = compararContrasenas(contrasena1, contrasena2)
    println(comprobacion)
}
