import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTwoNumsTest {

    @Test
    @DisplayName("Sum two numbers with same length and no carry-over at the last digit")
    void testNormalSum() {
        assertEquals("111", SumTwoNums.sum("50", "61"));
        assertEquals("579", SumTwoNums.sum("123", "456"));
    }

    @Test
    @DisplayName("Sum two numbers with different lengths")
    void testDifferentLength() {
        assertEquals("1321", SumTwoNums.sum("1234", "87"));
        assertEquals("100", SumTwoNums.sum("1", "99"));
    }

    @Test
    @DisplayName("Sum where carry propagates to the highest digit")
    void testCarryOver() {
        assertEquals("1000", SumTwoNums.sum("999", "1"));
        assertEquals("180", SumTwoNums.sum("90", "90"));
    }

    @Test
    @DisplayName("Sum involving zero")
    void testZero() {
        assertEquals("123", SumTwoNums.sum("123", "0"));
        assertEquals("0", SumTwoNums.sum("0", "0"));
    }

    @Test
    @DisplayName("Sum two very large numbers (beyond Long.MAX_VALUE)")
    void testLargeNumbers() {
        // Testing numbers that would cause overflow if handled as primitive longs
        String num1 = "9223372036854775807"; // Max Long
        String num2 = "1";
        String expected = "9223372036854775808";
        assertEquals(expected, SumTwoNums.sum(num1, num2));
    }
}