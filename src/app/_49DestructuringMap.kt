package app

fun main() {
    val map = mapOf(
            "a" to "Sanas",
            "b" to "Febriyan",
            "c" to "hmos9c"
    )

    for((key, value) in map){
        println("$key : $value")
    }

    // map.forEach { entry -> println("${entry.component1()} : ${entry.component2()}") }
    map.forEach { (key, value) -> println("$key : $value") }
}