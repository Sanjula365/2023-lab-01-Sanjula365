fun calculateCircleProperties(radius: Double): Pair<Double, Double> {
    val pi = 3.14
    val circumference = 2 * pi * radius
    val area = pi * radius * radius
    return Pair(circumference, area)
}

fun main() {
    val radius = 5.0
    val (circumference, area) = calculateCircleProperties(radius)
    println("Circumference: $circumference")
    println("Area: $area")
}