import org.junit.Test
import kotlin.test.assertEquals

class WordsAndLinesTest {

    @Test
    fun `empty String`() {
        assertEquals(Pair(0, 1), "".wordsAndLines())
    }

    @Test
    fun `one word`() {
        assertEquals(Pair(1, 1), "hello".wordsAndLines())
    }

    @Test
    fun `one word first character is whitespace`() {
        assertEquals(Pair(1, 1), " hello".wordsAndLines())
    }

    @Test
    fun `two words`() {
        assertEquals(Pair(2, 1), "hello world".wordsAndLines())
    }

    @Test
    fun `three words with whitespace at the end`() {
        assertEquals(Pair(3, 1), "hello world! how ".wordsAndLines())
    }

    @Test
    fun `three words with multiple spacing and whitespace at the end`() {
        assertEquals(Pair(3, 1), "hello      world!  how  ".wordsAndLines())
    }

    @Test
    fun `two words and two lines`() {
        assertEquals(Pair(2, 2), "Hello\nWorld!".wordsAndLines())
    }

    @Test
    fun `four words and two lines`() {
        assertEquals(
            Pair(4, 2),
            " Hello\nhello      world!  how  ".wordsAndLines()
        )
    }

    @Test
    fun `only one new Line`() {
        assertEquals(Pair(0, 2), "\n".wordsAndLines())
    }

    @Test
    fun `only new lines`() {
        assertEquals(Pair(0, 4), "\n\n\n".wordsAndLines())
    }

    @Test
    fun `one word with new lines`() {
        assertEquals(Pair(1, 4), "\r\n a \n\n".wordsAndLines())
    }
}