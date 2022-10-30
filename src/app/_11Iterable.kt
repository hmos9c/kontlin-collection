package app

fun <T> displayIterable(iterable: Iterable<T>) {
//    for (value in iterable) {
//        println(value)
//    }

    val iterator = iterable.iterator()
    while (iterator.hasNext()){
        val value = iterator.next()
        println(value)
    }
}

fun main() {
    displayIterable(listOf("Sanas", "Febriyan", "hmos9c"))
    displayIterable(setOf("Sanas", "Febriyan", "hmos9c"))
}