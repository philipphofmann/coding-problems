/**
 * Returns the longest substring without repeating character.
 */
fun longestSubstring(value: String): String {

    val subStrings = ArrayList<ByteArray>(value.length)

    value.toCharArray().forEachIndexed { i, char ->

        (0..i).forEach {
            val indexArray = subStrings[it]
            indexArray.getOrNull(char.toInt())

            indexArray.size

            subStrings[it][char.toInt()] = 0
        }
    }

    return value
}