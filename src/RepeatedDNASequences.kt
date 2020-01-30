/**
 * See https://leetcode.com/problems/repeated-dna-sequences/
 */
fun findRepeatedDNASequences(s: String): List<String> {
    val allowedChars = hashSetOf('A', 'C', 'G', 'T')
    require(s.all { char -> allowedChars.contains(char) }) {
        "'$s' contains an invalid char. Only the following chars are allowed: $allowedChars"
    }

    val sequences = hashSetOf<CharSequence>()
    val foundSequences = mutableListOf<String>()

    s.forEachIndexed { index, _ ->
        val endIndex = index + 10
        if (endIndex < s.length) {
            val sequence = s.subSequence(index, endIndex)

            if (sequences.contains(sequence)) {
                foundSequences.add(sequence.toString())
            }
            sequences.add(sequence)
        }
    }

    return foundSequences
}