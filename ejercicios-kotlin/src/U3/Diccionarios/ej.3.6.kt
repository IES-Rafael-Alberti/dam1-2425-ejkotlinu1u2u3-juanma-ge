package U3.Diccionarios

fun pedirDato(): Pair<String, String> {
    print("¿Qué dato quieres agregar? (por ejemplo, nombre, edad, correo, etc.): ")
    val clave = readLine()?.trim() ?: ""
    print("Introduce el valor para $clave: ")
    val valor = readLine()?.trim() ?: ""
    return Pair(clave, valor)
}

fun agregarDato(diccionario: MutableMap<String, String>, clave: String, valor: String) {
    diccionario[clave] = valor
    println("\nContenido actual del diccionario:")
    for ((c, v) in diccionario) {
        println("$c: $v")
    }
}

fun main() {
    val diccionario = mutableMapOf<String, String>()
    println("Programa de registro de información personal.")

    while (true) {
        val (clave, valor) = pedirDato()
        agregarDato(diccionario, clave, valor)

        print("¿Quieres agregar otro dato? (s/n): ")
        val continuar = readLine()?.trim()?.lowercase()
        if (continuar != "s") {
            println("\nRegistro final:")
            for ((c, v) in diccionario) {
                println("$c: $v")
            }
            break
        }
    }
}