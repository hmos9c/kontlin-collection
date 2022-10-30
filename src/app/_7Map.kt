package app

fun main() {
    val map: Map<String, String> = mapOf(
            Pair("a", "Sanas"),
            "b" to "Febriyan",
            "c" to "hmos9c"
    )

    for ((key, value) in map) {
        println("$key to $value")
    }
}