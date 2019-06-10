import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd() {
        assertEquals(2, calculator.add(1, 1), 0.01);
    }

    @Test
    public void canSubtract() {
        assertEquals(0, calculator.subtract(1, 1), 0.01);
    }

    @Test
    public void canMultiply() {
        assertEquals(4, calculator.multiply(2, 2), 0.01);
    }

    @Test
    public void canDivide() {
        assertEquals(3, calculator.divide(6, 2), 0.01);
    }

}
