import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add Two Number")
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    @DisplayName("Multiply Two Number")
    void multiple() {
        assertAll( ()-> assertEquals(4, Calculator.multiply(2, 2)),
                   ()-> assertEquals(-4, Calculator.multiply(2, -2)),
                   () -> assertEquals(4, Calculator.multiply(-2, -2)),
                   () -> assertEquals(0, Calculator.multiply(1, 0)));
    }
}