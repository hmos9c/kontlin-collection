package app

fun main() {
    val list: List<String> = listOf("Sanas", "Febriyan", "hmos9c")

    println(list[0])
    println(list[1])
    println(list[2])
    println(list.indexOf("Febriyan"))
    println(list.indexOf("Tidak Ada"))
    println(list.contains("Sanas"))
    println(list.contains("Tidak Ada"))
    println(list.containsAll(listOf("Sanas", "Febriyan")))
    println(list.isEmpty())
    println(list.isNotEmpty())
}