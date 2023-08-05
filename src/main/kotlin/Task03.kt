fun greetings(name: String, age: Int) {
    println("Hello, $name!")
    if (age >= 18) {
        println("You are eligible to apply for a driving license.")
    } else {
        println("You are not eligible to apply for a driving license.")
    }
}

fun main() {
    val name = "Alice"
    val age = 20
    greetings(name, age)
}