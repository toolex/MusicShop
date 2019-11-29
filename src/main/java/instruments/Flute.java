package instruments;

import enums.Family;

public class Flute extends Instrument {
    public Flute(String name, Family family, Double priceBought, Double salePrice) {
        super(name, family, priceBought, salePrice);
    }


    public String play() {
        return "Toot!";
    }
}
