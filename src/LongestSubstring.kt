/**
 * Longest substring without repeating character.
 */
object LongestSubstring {
    fun subString(s: String): String {

        val subStrings = ArrayList<ByteArray>(s.length)

        s.toCharArray().forEachIndexed { i, char ->

            (0..i).forEach {
                val indexArray = subStrings[it]
                indexArray.getOrNull(char.toInt())

                indexArray.size

                subStrings[it][char.toInt()] = 0
            }
        }

        return s
    }
}