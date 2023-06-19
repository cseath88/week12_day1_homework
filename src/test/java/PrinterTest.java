import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void Before() {
        printer = new Printer(50, 100);
    }

    @Test
    public void canPrint() {
        assertEquals(40, printer.printFunction(5, 2));
    }

    @Test
    public void canUseToner() {
        assertEquals(90, printer.printFunction(5, 2));
    }
}
