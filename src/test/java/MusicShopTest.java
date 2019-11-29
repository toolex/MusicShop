import accessories.GuitarString;
import accessories.SheetMusic;
import enums.Family;
import instruments.Flute;
import instruments.Guitar;
import instruments.Tuba;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {
    Guitar guitar;
    Tuba tuba;
    Flute flute;

    GuitarString guitarString;
    SheetMusic sheetMusic;

    MusicShop musicShop;

    @Before
    public void before(){
        guitar = new Guitar("Flying V", Family.STRINGS, 200.0, 300.0);
        tuba = new Tuba("The Big One", Family.BRASS, 300.0, 400.0);
        flute = new Flute("Silver Scrapes", Family.WOODWIND, 150.0, 200.0);

        guitarString = new GuitarString("Low E", 1.0, 3.0);
        sheetMusic = new SheetMusic("Guitar for Beginners", 25.0, 30.0);

        musicShop = new MusicShop("Tooley's", 500.0);
    }

    @Test
    public void startWithNoStock(){
        assertEquals(0, musicShop.getStock().size());
    }

    @Test
    public void canAddItemToStock(){
        musicShop.addItemToStock(guitar);
        musicShop.addItemToStock(guitarString);
        assertEquals(2, musicShop.getStock().size());
        assertEquals(299.0, musicShop.getCashInRegister(), 0.01);
    }

    @Test
    public void canSellItems(){
        musicShop.addItemToStock(guitar);
        musicShop.sellItem(guitar);
        assertEquals(600.0, musicShop.getCashInRegister(), 0.01);
    }
}
