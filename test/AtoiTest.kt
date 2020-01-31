import kotlin.test.Test
import kotlin.test.assertEquals

class AtoiTest {

    @Test
    fun `two digits positive number`() {
        assertEquals(42, atoi("+42"))
    }

    @Test
    fun `two digits negative number and trailing whitespaces`() {
        assertEquals(-42, atoi("  -42"))
    }

    @Test
    fun `digits with words`() {
        assertEquals(4193, atoi("4193 with words"))
    }

    @Test
    fun `words and digits`() {
        assertEquals(0, atoi("words and +987"))
    }

    @Test
    fun `int out of range`() {
        assertEquals(Int.MIN_VALUE, atoi("-91283472332"))
    }

    @Test
    fun `int min value`() {
        assertEquals(Int.MIN_VALUE, atoi("-2147483648"))
    }

    @Test
    fun `one more than int min value`() {
        assertEquals(-2147483647, atoi("-2147483647"))
    }

    @Test
    fun `int max value`() {
        assertEquals(Int.MAX_VALUE, atoi("2147483647"))
    }

    @Test
    fun `one less than int max value`() {
        assertEquals(2147483646, atoi("2147483646"))
    }
}

