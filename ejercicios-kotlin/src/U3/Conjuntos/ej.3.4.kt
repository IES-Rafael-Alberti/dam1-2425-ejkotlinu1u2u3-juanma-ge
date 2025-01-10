package U3.Conjuntos

fun encontrarFrutasComunes(setFrutas1: Set<String>, setFrutas2: Set<String>): Set<String> {
    return setFrutas1 intersect setFrutas2
}

fun encontrarFrutasSoloEnFrutas1(setFrutas1: Set<String>, setFrutas2: Set<String>): Set<String> {
    return setFrutas1 subtract setFrutas2
}

fun encontrarFrutasSoloEnFrutas2(setFrutas1: Set<String>, setFrutas2: Set<String>): Set<String> {
    return setFrutas2 subtract setFrutas1
}

fun main() {
    val frutas1 = listOf("manzana", "pera", "naranja", "plátano", "uva")
    val frutas2 = listOf("manzana", "pera", "durazno", "sandía", "uva")
    val setFrutas1 = frutas1.toSet()
    val setFrutas2 = frutas2.toSet()

    val frutasComunes = encontrarFrutasComunes(setFrutas1, setFrutas2)
    println("Frutas comunes: $frutasComunes")

    val frutasSoloEnFrutas1 = encontrarFrutasSoloEnFrutas1(setFrutas1, setFrutas2)
    println("Frutas solo en frutas1: $frutasSoloEnFrutas1")

    val frutasSoloEnFrutas2 = encontrarFrutasSoloEnFrutas2(setFrutas1, setFrutas2)
    println("Frutas solo en frutas2: $frutasSoloEnFrutas2")
}