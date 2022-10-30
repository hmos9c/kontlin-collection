package app

fun <T> displayCollection(collection: Collection<T>){
    for (element in collection){
        println(element)
    }
}

fun main() {
    displayCollection(listOf("Sanas", "Febriyan"))
    displayCollection(mutableListOf("Sanas", "Febriyan"))
    displayCollection(setOf("Sanas", "Febriyan"))
    displayCollection(mutableSetOf("Sanas", "Febriyan"))
    displayCollection(mapOf("Sanas" to "Febriyan").entries)
    // displayCollection(mapOf("Eko" to "Febriyan")) // error, Map bukan turunan Collection
}