import org.junit.Test
import kotlin.test.assertEquals

internal class LongestSubstringTest {


    @Test
    fun subStringWithLengthFour() {
        val actual = LongestSubstring.subString("abcabd")

        assertEquals("cabd", actual)
    }

    @Test
    fun allSameCharacters() {
        val actual = LongestSubstring.subString("bbbbbb")

        assertEquals("b", actual)
    }
}