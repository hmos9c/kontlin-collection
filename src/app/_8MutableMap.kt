package app

fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf()
    mutableMap.put("a", "Sanas")
    mutableMap["b"] = "Febriyan"
    mutableMap["c"] = "hmos9c"

    println(mutableMap["a"])
    println(mutableMap.get("b"))
    println(mutableMap.get("c"))
    println(mutableMap.getOrDefault("d", "Tidak Ada"))
    println(mutableMap.get("d"))

    mutableMap.remove("b")

    for ((key, value) in mutableMap) {
        println("$key to $value")
    }
}