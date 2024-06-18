fun main(args: Array<String>) {
    josephusSurvivor(7, 3)
}

fun josephusSurvivor(n: Int, k: Int): Int {
    if (n == 1) {
        return 1
    }
    return (josephusSurvivor(n - 1, k) + k - 1) % n + 1
}