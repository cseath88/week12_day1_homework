import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class WaterbottleTest {

    Waterbottle waterbottle;

    @Before
    public void Before() {
        waterbottle = new Waterbottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canDrink() {
        assertEquals(90, waterbottle.takeDrink());
    }

    @Test
    public void canEmpty() {
        assertEquals(0, waterbottle.emptyBottle());
    }

    @Test
    public void canFill() {
        waterbottle.emptyBottle();
        assertEquals(100, waterbottle.fillBottle());
    }
}
