import kotlin.math.abs
import kotlin.math.floor

fun convertToBase7(decimal: Long): String {

    val result = StringBuilder("")

    convertInternal(result, abs(decimal), 7)

    return if (decimal < 0) {
        "-$result"
    } else {
        result.toString()
    }
}

private fun convertInternal(result: StringBuilder, decimal: Long, base: Int) {
    val next = floor(decimal.div(base).toDouble()).toLong()

    if (next > 0) {
        convertInternal(result, next, base)
    }

    result.append(decimal.rem(base))
}
