fun main(args: Array<String>) {
    twoOldestAges(listOf(19,49,88,88,88))
}
fun twoOldestAges(ages: List<Int>): List<Int> {
    val max = ages.maxOrNull() ?: 0
    var currentMaxAge = 1
    val count = ages.count { it == max }
    val maxAges: List<Int>
    if (count < 2) {
        for (age: Int in ages) {
            if (currentMaxAge < age && age != max) {
                currentMaxAge = age
            }
        }
        maxAges = listOf(currentMaxAge, max)
    } else  {
        maxAges= listOf(max, max)
    }
    println(maxAges)
    return maxAges

}