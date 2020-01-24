import org.junit.Test
import kotlin.test.assertEquals

internal class ReverseIntegerTest {

    @Test
    fun twoDigits() {
        val actual = ReverseInteger.reverse(12)

        assertEquals(21, actual)
    }

    @Test
    fun twoMinusDigits() {
        val actual = ReverseInteger.reverse(-12)

        assertEquals(-21, actual)
    }

    @Test
    fun tenMinusDigits() {
        val actual = ReverseInteger.reverse(-123898274)

        assertEquals(-472898321, actual)
    }

    @Test
    fun biggerThanIntMaxValue() {
        val actual = ReverseInteger.reverse(-1238982742)

        assertEquals(0, actual)
    }
}