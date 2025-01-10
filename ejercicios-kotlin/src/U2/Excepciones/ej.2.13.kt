package U2.Excepciones

fun preguntaEco(): String {
    print("Introduce algo o escribe \"salir\": ")
    return readLine().orEmpty()
}

fun hacerEco(pregunta: String): Boolean {
    return if (pregunta.lowercase() == "salir") {
        println("Programa terminado.")
        false
    } else {
        println(pregunta)
        true
    }
}

fun main() {
    var pregunta = preguntaEco()
    hacerEco(pregunta)
    while (true) {
        pregunta = preguntaEco()
        if (!hacerEco(pregunta)) {
            break
        }
    }
}