package app

import data._3Person

fun main() {
    val set: Set<_3Person> = setOf(
            _3Person("Sanas"), _3Person("Febriyan"), _3Person("hmos9c"), _3Person("Sanas"), _3Person("Febriyan")
    )

    println(set.size)
    println(set.contains(_3Person("Sanas")))

    for (person in set){
        println(person)
    }
}