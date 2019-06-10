import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle = new WaterBottle(100);

    @Test
    public void canDrinkFromBottle(){
        assertEquals(90, this.waterBottle.drink());
    }

    @Test
    public void canEmptyWaterBottle(){
        assertEquals(0, this.waterBottle.empty());
    }

    @Test
    public void canFillWaterBottle(){
        assertEquals(100, this.waterBottle.fill());
    }
}
