import kotlin.test.Test
import kotlin.test.assertEquals

internal class ReversedIntTest {

    @Test
    fun `two digits`() {
        val actual = 12.reversed()

        assertEquals(21, actual)
    }

    @Test
    fun `two negative digits`() {
        val actual = (-12).reversed()

        assertEquals(-21, actual)
    }

    @Test
    fun `ten negative digits`() {
        val actual = (-123898274).reversed()

        assertEquals(-472898321, actual)
    }

    @Test
    fun `bigger than Int Max value`() {
        val actual = 1238982742.reversed()

        assertEquals(0, actual)
    }
}