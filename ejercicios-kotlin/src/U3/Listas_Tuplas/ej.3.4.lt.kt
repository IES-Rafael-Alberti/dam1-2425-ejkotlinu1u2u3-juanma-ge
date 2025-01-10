package U3.Listas_Tuplas

fun numLoteria() {
    val numeros = mutableListOf<Int>()

    for (i in 1..6) {
        print("Introduce los seis números de la lotería primitiva: ")
        val numero = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Por favor, ingrese un número entero válido.")
        numeros.add(numero)
    }
    println("Los números de la primitiva de este año son: $numeros")
}

fun main() {
    numLoteria()
}