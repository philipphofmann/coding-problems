/**
 * See https://leetcode.com/problems/missing-number/description/
 */
fun findMissingNumber(numbers: Array<Int>): Int {
    if (numbers.isEmpty()) return 0

    val sortedNumbers = numbers.sortedArray()
    if (sortedNumbers[0] < 0) {
        throw IllegalArgumentException("Only positive numbers are allowed.")
    }

    sortedNumbers.forEachIndexed { index, value ->
        if (index != value) {
            return index
        }
    }

    return 0
}
