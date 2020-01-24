import kotlin.math.floor

object ConvertToBase7 {

    private const val base = 7

    fun convert(decimal: Long): String {

        val result = StringBuilder("")

        convertInternal(result, Math.abs(decimal))

        return if (decimal < 0) {
            "-$result"
        } else {
            result.toString()
        }
    }

    private fun convertInternal(result: StringBuilder, decimal: Long) {
        val next = floor(decimal.div(base).toDouble()).toLong()

        if (next > 0) {
            convertInternal(result, next)
        }

        result.append(decimal.rem(base))
    }
}