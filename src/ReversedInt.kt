/**
 * Returns a Int with the digits in reversed order.
 */
fun Int.reversed(): Int {
    val valueAsString = this.toString()
    var reversedString = valueAsString.reversed()

    val isNegative = valueAsString[0] == '-'
    if (isNegative) {
        reversedString = "-${reversedString.trimEnd('-')}"
    }

    return try {
        Integer.parseInt(reversedString)
    } catch (e: NumberFormatException) {
        0
    }
}
