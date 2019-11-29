import enums.Family;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;
    Guitar guitar2;


    @Before
    public void before(){
        guitar = new Guitar("Flying V", Family.STRINGS, 200.0, 300.0);
        guitar2 = new Guitar("Stratocaster", Family.STRINGS, 300.0, 400.0);
    }

    @Test
    public void canShowMarkUp(){
        assertEquals(100, guitar.markUp(), 0.01);
    }

    @Test
    public void canShowNameFamilyPriceBoughtANdSold(){
        assertEquals("Flying V", guitar.getName());
        assertEquals(Family.STRINGS, guitar.getFamily());
        assertEquals(200.0, guitar.getPriceBought(), 0.01);
        assertEquals(300.0, guitar.getSalePrice(), 0.01);
    }

    @Test
    public void canSetName(){
        guitar.setName("Jim");
        assertEquals("Jim", guitar.getName());

    }

    @Test
    public void canChangePrice(){
        guitar.setPriceBought(250.0);
        guitar2.setSalePrice(350.0);
        assertEquals(250.0, guitar.getPriceBought(), 0.01);
        assertEquals(350.0, guitar2.getSalePrice(), 0.01);
    }

    @Test
    public void canBePlayed(){
        assertEquals("Strum!", guitar.play());
    }
}
