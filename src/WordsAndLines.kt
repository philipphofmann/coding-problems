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



