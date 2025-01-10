package
import U1
import U2
import U3

fun main() {
    while (true) {
        println(
            """
            |========================
            |       KOTLIN BÁSICO
            |========================
            |1. Ej-U1
            |2. Ej-U2
            |3. Ej-U3
            |4. SALIR
            |========================
            |Elige una opción:
        """.trimMargin()
        )
        when (readln().toIntOrNull()) {
            1 -> submenuU1()
            2 -> submenuU2()
            3 -> submenuU3()
            4 -> {
                println("Saliendo del programa...")
                break
            }
            else -> println("Opción inválida, intenta de nuevo.")
        }
    }
}

fun submenuU1() {
    while (true) {
        println(
            """
            |========================
            |       U1 - Básicos
            |========================
            |1. Ejercicio 4
            |2. Ejercicio 6
            |3. Ejercicio 12
            |4. Ejercicio 15
            |5. Ejercicio 18
            |6. Ejercicio 20
            |7. Ejercicio 21
            |8. Ejercicio 22
            |9. Ejercicio 24
            |10. Ejercicio 25
            |11. Ejercicio 26
            |12. Ejercicio 27
            |X. VOLVER
            |========================
            |Elige una opción:
        """.trimMargin()
        )
        when (readln()) {
            "1" ->
            "2" ->
            "3" ->
            "4" ->
            "5" ->
            "6" ->
            "7" ->
            "8" ->
            "9" ->
            "10" ->
            "11" ->
            "12" ->
            "X", "x" -> break
            else -> println("Opción inválida, intenta de nuevo.")
        }
    }
}

