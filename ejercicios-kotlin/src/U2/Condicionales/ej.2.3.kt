package U2.Condicionales

fun pedirNum1(): Double {
    print("Introduce un número: ")
    return readLine()?.toDoubleOrNull() ?: error("Entrada inválida. Se esperaba un número.")
}

fun pedirNum2(): Double {
    print("Introduce otro número: ")
    return readLine()?.toDoubleOrNull() ?: error("Entrada inválida. Se esperaba un número.")
}

fun comprobarDivision(num1: Double, num2: Double): String {
    return if (num2 == 0.0) {
        "**ERROR**"
    } else {
        (num1 / num2).toString()
    }
}

fun main() {
    val num1 = pedirNum1()
    val num2 = pedirNum2()
    val resultado = comprobarDivision(num1, num2)
    println(resultado)
}
