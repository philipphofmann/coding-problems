import org.junit.Test
import kotlin.test.assertEquals

internal class ReverseIntegerTest {

    @Test
    fun `two digits`() {
        val actual = ReverseInteger.reverse(12)

        assertEquals(21, actual)
    }

    @Test
    fun `two negative digits`() {
        val actual = ReverseInteger.reverse(-12)

        assertEquals(-21, actual)
    }

    @Test
    fun `ten negative digits`() {
        val actual = ReverseInteger.reverse(-123898274)

        assertEquals(-472898321, actual)
    }

    @Test
    fun `bigger than Int Max value`() {
        val actual = ReverseInteger.reverse(1238982742)

        assertEquals(0, actual)
    }
}