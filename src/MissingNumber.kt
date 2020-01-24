/**
 * See https://leetcode.com/problems/missing-number/description/
 */
object MissingNumber {

    fun findMissingNumber(numbers: Array<Int>): Int {

        for (i in numbers.indices) {
            val number = numbers[i]
            if (i != 0 && number > numbers[i - 1] + 1) {
                return number - 1
            }
        }

        return 0
    }
}