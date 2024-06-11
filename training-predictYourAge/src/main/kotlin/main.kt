import java.lang.Math.sqrt

fun main(args: Array<String>) {
    predictAge(4,2,2,2,2,2,0,0)
}
fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int{
    val listOfAges = listOf(age1, age2, age3, age4, age5, age6, age7, age8)
    var sum = 0
    for (age in listOfAges) {
        sum += (age*age)
    }
    sum = kotlin.math.sqrt(sum.toDouble()).toInt()
    sum /= 2
    return sum
}