import kotlin.test.Test
import kotlin.test.assertEquals

class ConvertToBase7Test {

    @Test
    fun `one below base`() {
        testWith("6", 6)
    }

    @Test
    fun `with base and negative`() = testWith("-10", -7)

    @Test
    fun `double base`() {
        testWith("20", 14)
    }

    @Test
    fun `triple base`() {
        testWith("-100", -49)
    }

    @Test
    fun `with 1000`() {
        testWith("2626", 1000)
    }

    @Test
    fun `large number`() {
        testWith("356165433503645021", 893879234523248)
    }

    private fun testWith(expected: String, value: Long) = assertEquals(expected, convertToBase7(value))

}