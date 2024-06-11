fun main(args: Array<String>) {
    overTheRoad(7, 6)
}
fun overTheRoad(address: Int, n: Int): Int {
    val lastOdd = (2 * n) -1
    val lastEven = (2 * n)
    var count = n
    var result = address

    if (address % 2 == 0) {
        // += 2 bis bei lastEven
        // -=2 ab lastOdd
        // ich bin even Seite
        while (count > 0 && result < lastEven) {
            count --
            result += 2
        }

        while (count > 0 && result - 1 <= lastOdd) {
            result -= 2
            count --
        }
        println(result + 1)
        return result + 1
    } else {
        // ich bin odd Seite
        // -=2 bis bei 1
        // +=2 ab lastEven
        while (count > 0 && result > 1) {
            count --
            result -= 2
        }

        while (count > 0 && result <= lastOdd) {
            result += 2
            count --
        }
        println(result - 1)
        return result -1
    }
}