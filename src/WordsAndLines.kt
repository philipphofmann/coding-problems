/**
 * Returns the words and lines of this char sequence.
 *
 * @return Pair for the words and lines. The first Int is the amount of words, the second is the amount of lines.
 */
fun String.wordsAndLines(): Pair<Int, Int> {
    if (this.isEmpty()) {
        return Pair(0, 1)
    }

    var lines = 1
    var words = 1

    var isPreviousWhitespace = false
    var inLineAtLeasOneChar = false
    for (c in this) {

        val isWhiteSpace = c.isWhitespace()
        if (isWhiteSpace && !isPreviousWhitespace && inLineAtLeasOneChar) {
            words++
        }

        if (c.toString() == System.lineSeparator()) {
            lines++
            inLineAtLeasOneChar = false
        }

        isPreviousWhitespace = isWhiteSpace
        if (!isPreviousWhitespace) inLineAtLeasOneChar = true
    }

    if (isPreviousWhitespace) words--

    return Pair(words, lines)
}



