fun main () {
    val dinero_depositado = pedir_dinero()
    val interes_anual: Float = 4.0f/100

    if (dinero_depositado != null) {
        calcular(dinero_depositado, interes_anual.toFloat())
    } else {
        println("Entrada inválida. Por favor, introduce valores numéricos válidos.")
    }
}

fun pedir_dinero (): Float? {
    println("Introduce la cantidad de dinero depositada en la cuenta de ahorros: ")
    return readLine()?.toFloatOrNull()
}

fun calcular (dinero_depositado: Float, interes_anual: Float) {
    var total_dinero = dinero_depositado
    for(anio in 1..3) {
        total_dinero += total_dinero * interes_anual
        println("El dinero total a los 3 años después del año $anio es de ${"%.2f".format(total_dinero)}")
    }
}
