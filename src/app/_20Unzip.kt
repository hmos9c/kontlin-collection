package app

fun main() {
    val list: List<Pair<String, String>> = listOf(
            "Sanas" to "hmos9c",
            "Febriyan" to "Febriyan",
            "hmos9c" to "Sanas"
    )

    val pair: Pair<List<String>, List<String>> = list.unzip()
    println(pair.first)
    println(pair.second)

    val (list1, list2) = list.unzip()
    println(list1)
    println(list2)
}