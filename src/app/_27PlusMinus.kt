package app

fun main() {
    val list1 = listOf("Sanas", "Feb", "riyan")
    val list2 = list1 + "hmos9c"
    println(list2)
    val list3 = list1 + listOf("hmos", "9c", "Sanas")
    println(list3)
    val list4 = list1 - "Sanas"
    println(list4)
    val list5 = list1 - listOf("Sanas", "Febriyan", "Akmal")
    println(list5)

    val map1 = mapOf("a" to "Sanas", "b" to "Febriyan")
    val map2 = map1 + ("c" to "hmos9c")
    println(map2)
    val map3 = map1 - "a"
    println(map3)
}