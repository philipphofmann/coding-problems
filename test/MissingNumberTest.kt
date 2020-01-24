import org.junit.Test
import kotlin.test.assertEquals

internal class MissingNumberTest {

    @Test
    fun `second number is missing`() {
        val actual = findMissingNumber(arrayOf(0, 1, 3))

        assertEquals(2, actual)
    }

    @Test
    fun `five digits`() {
        val actual = findMissingNumber(arrayOf(0, 1, 2, 3, 5))

        assertEquals(4, actual)
    }
}
