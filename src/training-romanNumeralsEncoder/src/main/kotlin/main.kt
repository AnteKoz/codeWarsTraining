import kotlin.math.log

fun main(args: Array<String>) {
    encode(3496)
}

fun encode(num: Int): String {
    var deltaNum: Int = num
    var result = ""
    var count:Int
    val romanList = linkedMapOf("M" to 1000, "CM" to 900,"XM" to 990, "D" to 500, "CD" to 400,  "XD" to 490, "C" to 100, "XC" to 90, "L" to 50, "XL" to 40, "X" to 10,  "IX" to 9, "V" to 5, "IV" to 4, "I" to 1)

    for (number in romanList) {
        count = deltaNum / number.value
        when {
            deltaNum >= number.value -> {
                deltaNum %= number.value
                count.let { while (count != 0) {
                            result += number.key
                            count --

                }
                }
            }
        }
    }
    println(result)
    return result
}
