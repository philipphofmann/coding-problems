/**
 * Returns the longest subsequence with unique character.
 */
fun longestUniqueSubSequence(value: String): String {
    var longestUniqueSubSequence = ""
    value.forEachIndexed { index, _ ->
        val uniqueSubsequence = uniqueSubSequence(value.subSequence(index, value.length))
        if (longestUniqueSubSequence.length < uniqueSubsequence.length) {
            longestUniqueSubSequence = uniqueSubsequence
        }
    }

    return longestUniqueSubSequence
}

private fun uniqueSubSequence(sequence: CharSequence): String {
    var uniqueSubSequence = ""
    sequence.forEach { char ->
        if (!uniqueSubSequence.contains(char)) {
            uniqueSubSequence += char
        } else {
            return uniqueSubSequence
        }
    }

    return uniqueSubSequence
}
