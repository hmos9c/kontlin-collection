package app

fun main() {
    val list1: List<String> = listOf("San", "Feb", "hmos")
    val list2: List<String> = listOf("as", "riyan", "9c")

    val list3: List<Pair<String, String>> = list1.zip(list2)
    println(list3)

    val list4: List<String> = list1.zip(list2){ value1, value2 ->
        "$value1$value2"
    }
    println(list4)
}