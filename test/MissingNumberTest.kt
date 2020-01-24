import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class MissingNumberTest {

    @Test
    fun `three digits second number is missing`() {
        testWith(2, arrayOf(3, 0, 1))
    }

    @Test
    fun `five digits 5th number is missing`() {
        testWith(4, arrayOf(0, 1, 2, 3, 5))
    }

    @Test
    fun `not sorted array`() {
        testWith(8, arrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1))
    }

    @Test
    fun `empty array`() {
        testWith(0, emptyArray())
    }

    @Test
    fun `array with one element`() {
        testWith(0, arrayOf(10))
    }

    @Test
    fun `negative number`() {
        assertFailsWith(IllegalArgumentException::class) {
            findMissingNumber(arrayOf(0, 1, 2, 3, -1))
        }
    }

    private fun testWith(expected: Int, values: Array<Int>) {
        assertEquals(expected, findMissingNumber(values))
    }
}
