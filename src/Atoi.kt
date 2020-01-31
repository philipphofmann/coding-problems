/**
 * Parses the string as an [Int] number and returns the result.
 * See https://leetcode.com/problems/string-to-integer-atoi/
 *
 * @throws NumberFormatException if the string is not a valid representation of a number.
 */
fun atoi(string: String): Int {

    val noWhitespaces = string.trim { it.isWhitespace() }
    if (!isDigit(noWhitespaces[0])) {
        return 0
    }

    val digitsAndNegativeSign = noWhitespaces.trim { char -> !isDigit(char) || char == '+' }

    val isNegative = digitsAndNegativeSign[0] == '-'
    val digits = if (isNegative) {
        digitsAndNegativeSign.removeRange(0, 1)
    } else {
        digitsAndNegativeSign
    }

    var result = 0
    var exponent = 1.0
    var overflow = false

    for (i in digits.length - 1 downTo 0) {

        val digitValue = (charToInt(digits[i]) * exponent).toInt()

        val r = result + digitValue
        // HD 2-12 Overflow if both arguments have the opposite sign of r
        if (result xor r and (digitValue xor r) < 0) {
            overflow = true
            break
        }
        result = r

        exponent *= 10
    }

    result = if (isNegative) -result else result

    return if (overflow) {
        if (result < 0) {
            Int.MIN_VALUE
        } else {
            Int.MAX_VALUE
        }
    } else {
        result
    }
}

private fun isDigit(char: Char) = charToInt(char) >= 0 || char == '-' || char == '+'

private fun charToInt(char: Char): Int {
    return when (char) {
        '0' -> 0
        '1' -> 1
        '2' -> 2
        '3' -> 3
        '4' -> 4
        '5' -> 5
        '6' -> 6
        '7' -> 7
        '8' -> 8
        '9' -> 9
        else -> Int.MIN_VALUE
    }
}
