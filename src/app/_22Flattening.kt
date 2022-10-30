package app

class Member(val name: String, val hobies: List<String>)

fun main() {
    val list: List<List<String>> = listOf(
            listOf("Sanas", "Febriyan", "hmos9c"),
            listOf("Sanas", "Febriyan", "hmos9c"),
            listOf("Sanas", "Febriyan", "hmos9c"),
            listOf("Sanas", "Febriyan", "hmos9c")
    )

    val listString: List<String> = list.flatten()
    println(listString)

    val members: List<Member> = listOf(
            Member("Sanas", listOf("Gaming", "Coding")),
            Member("Akmal", listOf("Reading", "Traveling"))
    )

    // val hobies = members.map { it.hobies } .flatten()
    val hobies: List<String> = members.flatMap { it.hobies }
    println(hobies)
}