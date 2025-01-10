package U2.Condicionales

fun elegirIngredientes(pizza: String, ingredienteAdicional: String, ingredienteAdicional2: String): String {
    return if (pizza.lowercase() == "vegetariana") {
        ingredienteAdicional
    } else if (pizza.lowercase() == "no vegetariana") {
        ingredienteAdicional2
    } else {
        "No válido"
    }
}

fun main() {
    println("¿Desea como ingrediente adicional pimiento o tofu?:")
    val ingredienteAdicional = readLine().orEmpty()

    println("¿Desea como ingrediente adicional peperoni, jamón o salmón?:")
    val ingredienteAdicional2 = readLine().orEmpty()

    println("¿Desea una pizza vegetariana o no vegetariana?:")
    val pizza = readLine().orEmpty()

    val ingrediente = elegirIngredientes(pizza, ingredienteAdicional, ingredienteAdicional2)
    println("Tu pizza es $pizza y aparte de mozzarella y tomate lleva $ingrediente.")
}