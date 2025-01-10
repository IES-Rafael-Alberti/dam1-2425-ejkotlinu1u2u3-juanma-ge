package U3.Listas_Tuplas

val asignaturas = listOf("Matemáticas", "Física", "Química", "Historia", "Lengua")

fun evaluarNotas(notas: List<Double>): List<String> {
    val suspendidas = mutableListOf<String>()
    for (i in notas.indices) {
        if (notas[i] < 5.0) {
            suspendidas.add(asignaturas[i])
        }
    }
    return suspendidas
}

fun main() {
    val notas = mutableListOf<Double>()
    for (asignatura in asignaturas) {
        while (true) {
            print("Introduce tu nota de $asignatura: ")
            val nota = readLine()?.toDoubleOrNull()
            if (nota != null && nota in 0.0..10.0) {
                notas.add(nota)
                break
            } else {
                println("La nota debe estar entre 0 y 10. Inténtalo de nuevo.")
            }
        }
    }

    val suspendidas = evaluarNotas(notas)
    if (suspendidas.isNotEmpty()) {
        println("Debes repetir ${suspendidas.joinToString(", ")}")
    } else {
        println("No tienes que repetir ninguna asignatura.")
    }
}