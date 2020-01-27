import java.util.*

/**
 * See https://leetcode.com/problems/valid-parentheses/
 */
fun hasValidParentheses(input: String): Boolean {
    val parenthesesPairs = hashMapOf(')' to '(', '}' to '{', ']' to '[')

    val stack = Stack<Char>()

    input.forEach { parenthesis ->
        val openingParenthesis = parenthesesPairs[parenthesis]
        if (openingParenthesis == null) {
            require(parenthesesPairs.containsValue(parenthesis)) {
                "Invalid parenthesis found: '$parenthesis'"
            }
            stack.push(parenthesis)
        } else {
            if (stack.isEmpty()) {
                return false
            }
            val previous = stack.pop()
            if (previous != openingParenthesis) {
                return false
            }
        }
    }

    return stack.isEmpty()
}