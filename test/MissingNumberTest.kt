import org.junit.Test
import kotlin.test.assertEquals

internal class MissingNumberTest {

    @Test
    fun findMissingNumber() {
        val actual = MissingNumber.findMissingNumber(arrayOf(0, 1, 3))

        assertEquals(2, actual)
    }

    @Test
    fun findMissingNumbera() {
        val actual = MissingNumber.findMissingNumber(arrayOf(10, 11, 12, 13))

        assertEquals(2, actual)
    }
}
