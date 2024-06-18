fun main(args: Array<String>) {
    longestRepetition("fisuHVBSfvhjbeWVJADSBVJLASNVJABdvjbaHJNVSBDVvhblSVBLXY^^Nxb cvymxcn jbbnosuv  sdsdnVUbdvjsbvdNCVMYBV JSBDVBsdbksökööösfblnfsbnsFBNSKBFSF ")
}
fun longestRepetition(s: String): Pair<Char?, Int> {
    var count = 1
    val map = linkedMapOf<Char, Int>()
    val str = s.uppercase()
    println()
    if (s != "") {
        for (i in str.indices) {
            val nextChar: Char = try {
                s[i + 1]
            } catch (e: StringIndexOutOfBoundsException) {
                s[i]
            }

            if (s.toCharArray().contains(s[i])) {
                map[s[i]] = count++
            }

            if (!nextChar.equals(s[i])) {
                count = 1
            }
        }
        val findMax = map.maxBy { it.value }
        println(findMax)
        map.forEach {
            if (it.value >= findMax.value && it.key == findMax.key) {
                println(Pair(it.key, it.value))
                return Pair(it.key, it.value)
            }
        }
    }
        return Pair(null, 0)

}


fun bla (s: String): Pair<Char?, Int> {
    val map = linkedMapOf<Char, Int>()
    var count = 1
    for (i in s.indices) {
        val nextChar: Char = try {
            s[i + 1]
        } catch (e: StringIndexOutOfBoundsException) {
            s[i]
        }
        if (nextChar == s[i]) {
            map[s[i]] = count++
        } else {
            count = 1
        }

    }
    println(map)
    return Pair(null, 0)
}

