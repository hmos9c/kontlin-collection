package app

fun <T> displayMutableCollection(collection: MutableCollection<T>){
    for (element in collection){
        println(element)
    }
}

fun main() {
    // displayMutableCollection(listOf("Sanas", "Febriyan")) // ERROR
    displayMutableCollection(mutableListOf("Sanas", "Febriyan"))
    // displayMutableCollection(setOf("Sanas", "Febriyan")) // ERROR
    displayMutableCollection(mutableSetOf("Sanas", "Febriyan"))
    // displayMutableCollection(mapOf("Sanas" to "Febriyan").entries) // ERROR
    displayMutableCollection(mutableMapOf("Sanas" to "Febriyan").entries)
}