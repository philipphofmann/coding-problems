import kotlin.test.Test
import kotlin.test.assertEquals

class LongestSubstringTest {

    @Test
    fun subStringWithLengthFour() {
        val actual = longestSubstring("abcabd")

        assertEquals("cabd", actual)
    }

    @Test
    fun allSameCharacters() {
        val actual = longestSubstring("bbbbbb")

        assertEquals("b", actual)
    }
}