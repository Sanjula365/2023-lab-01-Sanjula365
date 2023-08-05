fun whoAmI(value: Any): String {
    return value.javaClass.simpleName
}

fun main() {
    println(whoAmI(5))
    println(whoAmI("Hello"))
    println(whoAmI(3.14))
    println(whoAmI(true))
}