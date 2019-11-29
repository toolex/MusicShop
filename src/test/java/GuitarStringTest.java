import accessories.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {
    GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString("Low E", 1.0, 3.0);
    }

    @Test
    public void canGetNamePriceBoughtAndSalePrice(){
        assertEquals("Low E", guitarString.getName());
        assertEquals(1.0, guitarString.getPriceBought(), 0.01);
        assertEquals(3.0, guitarString.getSalePrice(), 0.01);
    }
}
