import kotlin.test.Test
import kotlin.test.assertEquals

class LongestUniqueSubSequenceTest {

    @Test
    fun `length of two`() {
        testWith("ac", "aac")
    }

    @Test
    fun `empty string`() {
        testWith("", "")
    }

    @Test
    fun `length of four`() {
        testWith("cabd", "abcabd")
    }

    @Test
    fun `all repeating except middle`() {
        testWith("abhic", "aaaaabhicaaaaaa")
    }

    @Test
    fun `all characters are the same`() {
        testWith("b", "bbbb")
    }

    @Test
    fun `with whitespaces and symbols`() {
        testWith("abcd0? \nni", "abcdabcd0? \nnia")
    }

    private fun testWith(expected: String, value: String) {
        assertEquals(expected, longestUniqueSubSequence(value))
    }
}