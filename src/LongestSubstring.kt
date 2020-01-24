/**
 * Returns the longest substring without repeating character.
 */
fun longestSubstring(value: String): String {
    var longest = ""
    value.forEachIndexed { index, _ ->
        val nonRepeating = longestNonRepeating(value.subSequence(index, value.length))

        if (longest.length < nonRepeating.length) {
            longest = nonRepeating
        }
    }

    return longest
}

private fun longestNonRepeating(subSequence: CharSequence): String {
    var longestString = ""
    subSequence.forEach { char ->
        if (!longestString.contains(char)) {
            longestString += char
        } else {
            return longestString
        }
    }

    return longestString
}
