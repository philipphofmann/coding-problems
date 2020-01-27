import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class ValidParenthesesTest {
    @Test
    fun `one parentheses`() {
        assertTrue(hasValidParentheses("()"))
    }

    @Test
    fun `all parentheses`() {
        assertTrue(hasValidParentheses("()[]{}"))
    }

    @Test
    fun `wrong nested parentheses`() {
        assertFalse(hasValidParentheses("()[{]}"))
    }

    @Test
    fun `only opening  parentheses`() {
        assertFalse(hasValidParentheses("(["))
    }

    @Test
    fun `only closing  parentheses`() {
        assertFalse(hasValidParentheses(")}"))
    }

    @Test
    fun `empty string`() {
        assertTrue(hasValidParentheses(""))
    }

    @Test
    fun `invalid chars only`() {
        assertFailsWith(IllegalArgumentException::class) {
            hasValidParentheses(" 1")
        }
    }

    @Test
    fun `valid and invalid chars`() {
        assertFailsWith(IllegalArgumentException::class) {
            hasValidParentheses("( 1)")
        }
    }
}