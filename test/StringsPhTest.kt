import org.junit.Test
import kotlin.test.assertEquals

class StringsPhTest {

    @Test
    fun emptyString() {
        assertEquals(Pair(0, 1), "".wordsAndLines())
    }

    @Test
    fun oneWord() {
        assertEquals(Pair(1, 1), "hello".wordsAndLines())
    }

    @Test
    fun oneWordFirstIsWhitespace() {
        assertEquals(Pair(1, 1), " hello".wordsAndLines())
    }

    @Test
    fun twoWords() {
        assertEquals(Pair(2, 1), "hello world".wordsAndLines())
    }

    @Test
    fun threeWordsWithWhitespaceAtEnd() {
        assertEquals(Pair(3, 1), "hello world! how ".wordsAndLines())
    }

    @Test
    fun threeWordsWithMultipleSpacingAndWhitespaceAtEnd() {
        assertEquals(Pair(3, 1), "hello      world!  how  ".wordsAndLines())
    }

    @Test
    fun twoWordsAndTwoLines() {
        assertEquals(Pair(2, 2), "Hello\nWorld!".wordsAndLines())
    }

    @Test
    fun fourWordsAndTwoLines() {
        assertEquals(
            Pair(4, 2),
            " Hello\nhello      world!  how  ".wordsAndLines()
        )
    }

    @Test
    fun onlyOneNewLine() {
        assertEquals(Pair(0, 2), "\n".wordsAndLines())
    }

    @Test
    fun onlyNewLines() {
        assertEquals(Pair(0, 4), "\n\n\n".wordsAndLines())
    }

    @Test
    fun oneWordWithNewLines() {
        assertEquals(Pair(1, 4), "\r\n a \n\n".wordsAndLines())
    }
}