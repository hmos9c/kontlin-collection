package app

fun main() {
    val pair1: Pair<String, String> = Pair("Sanas", "Febriyan")
    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<String, String> = "Sanas" to "Febriyan"
    println(pair2.first)
    println(pair2.second)
}