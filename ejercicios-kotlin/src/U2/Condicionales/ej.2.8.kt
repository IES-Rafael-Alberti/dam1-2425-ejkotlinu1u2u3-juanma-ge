package U2.Condicionales

fun evaluarEmpleado(puntuacion: Double): String {
    val beneficioBase = 2400.0
    val nivel: String
    val beneficio: Double

    when (puntuacion) {
        0.0 -> {
            nivel = "Inaceptable"
            beneficio = beneficioBase * puntuacion
        }
        0.4 -> {
            nivel = "Aceptable"
            beneficio = beneficioBase * puntuacion
        }
        in 0.6..Double.MAX_VALUE -> {
            nivel = "Meritorio"
            beneficio = beneficioBase * puntuacion
        }
        else -> return "Puntuación no válida. Debe ser 0.0, 0.4, 0.6 o más."
    }

    return "Nivel: $nivel, Beneficio: %.2f€".format(beneficio)
}

fun main() {
    println("Introduce la puntuación del empleado (0.0, 0.4, 0.6 o más): ")
    val puntuacion = readLine()?.toDoubleOrNull() ?: return println("Puntuación inválida")
    val evaluacion = evaluarEmpleado(puntuacion)
    println(evaluacion)
}
