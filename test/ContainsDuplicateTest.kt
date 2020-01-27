import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ContainsDuplicateTest {

    @Test
    fun `contains one duplicate`() {
        assertTrue(containsDuplicate(listOf(1, 2, 3, 1)))
    }

    @Test
    fun `contains no duplicate`() {
        assertFalse(containsDuplicate(listOf(1, 2, 3)))
    }

    @Test
    fun `contains multiple duplicate`() {
        assertTrue(containsDuplicate(listOf(1, 2, 3, 3, 2, 1, 2)))
    }

}