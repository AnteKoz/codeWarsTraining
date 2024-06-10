fun main(args: Array<String>) {
    disemvowel("YaR")
}

fun disemvowel(str: String): String {

    var result = ""
    for (c in str) {
        if (c != 'A' && c != 'a'
            && c != 'E' && c != 'e'
            && c != 'I' && c != 'i'
            && c != 'O' && c != 'o'
            && c != 'U' && c != 'u') {
            result += c.toString()
        }
    }
    println(result)
    return result
}