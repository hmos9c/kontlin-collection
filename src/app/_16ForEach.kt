package app

fun main() {
//    for (value in listOf("Sanas", "Febriyan", "hmos9c")) {
//        println(value)
//    }

    setOf("Sanas", "Febriyan", "hmos9c").forEach {
        println(it)
    }

    mutableSetOf("Sanas", "Febriyan", "hmos9c").forEachIndexed { index, value ->
        println("$index : $value")
    }
}