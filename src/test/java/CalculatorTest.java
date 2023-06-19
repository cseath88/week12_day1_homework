import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    Calculator calculator;


    @Test
    public void canAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.addFunction(3, 2));
    }

    @Test
    public void canSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.subtractFunction(7, 2));
    }

    @Test
    public void canMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(14, calculator.multiplyFunction(2, 7));
    }

    @Test
    public void canDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divideFunction(4, 2), 0.0);
    }
}
