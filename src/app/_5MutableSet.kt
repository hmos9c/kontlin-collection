package app

import data._3Person

fun main() {
    val mutableSet: MutableSet<_3Person> = mutableSetOf()
    mutableSet.add(_3Person("Sanas"))
    mutableSet.add(_3Person("Febriyan"))
    mutableSet.add(_3Person("hmos9c"))
    mutableSet.add(_3Person("Sanas"))
    mutableSet.add(_3Person("Febriyan"))

    for (person in mutableSet) {
        println(person)
    }

    val mutableSetString = mutableSetOf("Sanas", "Febriyan", "hmos9c")
}