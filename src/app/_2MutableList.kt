package app

fun main() {
    val mutableList: MutableList<String> = mutableListOf()

    mutableList.add("Sanas")
    mutableList.add("Febriyan")
    mutableList.add("hmos9c")

    // mutableList[0] = "Akmal"
    // mutableList.remove("Sanas")

    for (value in mutableList) {
        println(value)
    }
}