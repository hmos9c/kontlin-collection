package app

fun main() {
    val map: Map<Int, String> = mapOf(
            1 to "Sanas",
            2 to "Febriyan",
            3 to "hmos9c"
    )

    val mapKeys = map.mapKeys { it.key * 10 }
    println(mapKeys)

    val mapValues = map.mapValues { it.value.toUpperCase() }
    println(mapValues)
}