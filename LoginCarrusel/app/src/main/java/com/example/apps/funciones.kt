import kotlin.math.sqrt

fun suma(a: Int, b: Int): Int {
    return a + b
}

fun resta(a: Int, b: Int): Int {
    return a - b
}

fun multi(a: Int, b: Int): Int {
    return a * b
}

fun divi(a: Int, b: Int): Int {
    if (b == 0) {
        println("⚠️ Error: No se puede dividir entre 0")
        return 0
    }
    return a / b
}

fun areacir(pi: Double, radio: Int): Double {
    return pi * radio * radio
}

fun raiz(a: Double): Double {
    return sqrt(a)
}

fun main() {
    print("Ingresa el primer número: ")
    val a = readLine()?.toIntOrNull() ?: 0

    print("Ingresa el segundo número: ")
    val b = readLine()?.toIntOrNull() ?: 0

    println("\n--- Resultados ---")
    println("Suma: ${suma(a, b)}")
    println("Resta: ${resta(a, b)}")
    println("Multiplicación: ${multi(a, b)}")
    println("División: ${divi(a, b)}")
    println("Área de un círculo (radio = $b): ${areacir(3.1416, b)}")
    println("Raíz cuadrada de $b: ${raiz(b.toDouble())}")
}
