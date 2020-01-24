import org.junit.Test
import kotlin.test.assertEquals

internal class MissingNumberTest {

    @Test
    fun `three digits second number is missing`() {
        val actual = findMissingNumber(arrayOf(0, 1, 3))

        assertEquals(2, actual)
    }

    @Test
    fun `five digits 5th number is missing`() {
        val actual = findMissingNumber(arrayOf(0, 1, 2, 3, 5))

        assertEquals(4, actual)
    }

    @Test
    fun `empty array`() {
        val actual = findMissingNumber(emptyArray())

        assertEquals(0, actual)
    }
}
