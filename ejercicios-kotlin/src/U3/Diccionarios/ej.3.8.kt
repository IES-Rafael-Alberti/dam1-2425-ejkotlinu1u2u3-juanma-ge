package U3.Diccionarios

fun crearDiccionario(): MutableMap<String, String> {
    print("Introduce las traducciones en formato 'palabra:traducción(al inglés)', separadas por comas: ")
    val entrada = readLine()?.trim() ?: ""
    val diccionario = mutableMapOf<String, String>()
    val pares = entrada.split(",")

    for (par in pares) {
        val (palabra, traduccion) = par.split(":").map { it.trim() }
        diccionario[palabra] = traduccion
    }

    return diccionario
}

fun traducirFrase(diccionario: Map<String, String>): String {
    print("Introduce una frase en español: ")
    val frase = readLine()?.trim() ?: ""
    val palabras = frase.split(" ")
    val traduccion = palabras.map { palabra ->
        diccionario[palabra] ?: palabra
    }

    return traduccion.joinToString(" ")
}

fun main() {
    val diccionario = crearDiccionario()
    val fraseTraducida = traducirFrase(diccionario)
    println("Frase traducida: $fraseTraducida")
}