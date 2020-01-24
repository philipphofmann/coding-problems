object ReverseInteger {
    fun reverse(value: Int): Int {
        val valueAsString = value.toString()
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
}