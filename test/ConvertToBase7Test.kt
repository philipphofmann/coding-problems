import kotlin.test.Test
import kotlin.test.assertEquals

class ConvertToBase7Test {

    private var decimal: Long = 0
    private var actual: String = ""

    @Test
    fun convert_7() {
        givenDecimal(6)

        whenConvertToBase7()

        thenShouldBe("6")
    }

    @Test
    fun convert_8() {
        givenDecimal(8)

        whenConvertToBase7()

        thenShouldBe("11")
    }

    @Test
    fun convert_14() {
        givenDecimal(14)

        whenConvertToBase7()

        thenShouldBe("20")
    }

    @Test
    fun convert_49() {
        givenDecimal(49)

        whenConvertToBase7()

        thenShouldBe("100")
    }

    @Test
    fun convert_1000() {
        givenDecimal(1000)

        whenConvertToBase7()

        thenShouldBe("2626")
    }

    @Test
    fun convert_100() {
        givenDecimal(100)

        whenConvertToBase7()

        thenShouldBe("202")
    }

    @Test
    fun convert_893879234523245978() {
        givenDecimal(893879234523248)

        whenConvertToBase7()

        thenShouldBe("356165433503645021")
    }

    @Test
    fun convert_Minus7() {
        givenDecimal(-7)

        whenConvertToBase7()

        thenShouldBe("-10")
    }


    private fun givenDecimal(decimal: Long) {
        this.decimal = decimal
    }

    private fun whenConvertToBase7() {
        actual = convertToBase7(decimal)
    }

    private fun thenShouldBe(expected: String) {
        assertEquals(expected, actual)
    }
}