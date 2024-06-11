fun main(args: Array<String>) {
    reverseLetter("Ante1234?=ß32e")
}

fun reverseLetter(str: String): String {
    var reverse = ""
    reverse = str.reversed()
    return reverse.filter { it.isLetter() }
}