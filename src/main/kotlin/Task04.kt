fun main() {
    val names = arrayOf("John", "Jane", "Bob", "Alice", "Michael")
    for ((index, name) in names.withIndex()) {
        println("Index: $index, Name: $name")
    }
}