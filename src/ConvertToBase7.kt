import kotlin.math.abs
import kotlin.math.floor

fun convertToBase7(decimal: Long): String {

    val result = StringBuilder("")

    convertInternal(result, abs(decimal))

    return if (decimal < 0) {
        "-$result"
    } else {
        result.toString()
    }
}

private fun convertInternal(result: StringBuilder, decimal: Long) {
    val base = 7

    val next = floor(decimal.div(base).toDouble()).toLong()

    if (next > 0) {
        convertInternal(result, next)
    }

    result.append(decimal.rem(base))
}
