package U2.Excepciones

fun pedirNumero(): Int {
    print("Introduce un número entero: ")
    return readLine()?.toIntOrNull() ?: 0
}

fun bucleNum(numInicial: Int) {
    var suma = 0
    var num = numInicial

    while (true) {
        if (num > 0) {
            suma += num
        }
        if (num == 0) {
            break
        }
        num = pedirNumero()
    }
    println(suma)
}

fun main() {
    val num = pedirNumero()
    bucleNum(num)
}