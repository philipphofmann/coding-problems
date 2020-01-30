import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class RepeatedDNASequencesTest {
    @Test
    fun `two repeating`() {
        testWith(listOf("AAAAACCCCC", "CCCCCAAAAA"), "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT")
    }

    @Test
    fun `no repeating`() {
        testWith(emptyList(), "AAAAAAAAAG")
    }

    @Test
    fun `empty String`() {
        testWith(emptyList(), "")
    }

    @Test
    fun `non valid character`() {
        assertFailsWith(IllegalArgumentException::class) {
            findRepeatedDNASequences("A0G")
        }
    }

    private fun testWith(expected: List<String>, s: String) {
        assertEquals(expected, findRepeatedDNASequences(s))
    }
}