fun main (){
    println("Introduce un precio de un producto. ")
    val importe_final = readLine()?.toFloatOrNull()
    if (importe_final != null) {
        sacar_iva_e_importe(importe_final)
    } else {
        println("Entrada inválida. Por favor, introduce un número válido.")
    }
}

fun sacar_iva_e_importe (importe_final: Float){
    val precio_iva = importe_final * 0.10
    val importe_sin_iva = importe_final - precio_iva
    println("El iva del producto son $precio_iva euros y el precio sin iva son $importe_sin_iva euros.")
}