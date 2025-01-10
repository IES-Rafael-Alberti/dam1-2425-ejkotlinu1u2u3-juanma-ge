fun main() {
    val peso = pedir_peso()
    val altura = pedir_altura()

    if (peso != null && altura != null) {
        calcular_imc(peso, altura)
    } else {
        println("Entrada inválida. Por favor, introduce valores numéricos válidos.")
    }
}

fun pedir_peso (): Float? {
    println("Introduce tu peso en kg:")
    return  readLine()?.toFloatOrNull()
}

fun pedir_altura (): Float? {
    println("Introduce tu altura en metros: ")
    return readLine()?.toFloatOrNull()
}

fun calcular_imc (peso: Float, altura: Float) {
    val imc = peso / (altura * altura)
    println("Tu imc es $imc.")
}
