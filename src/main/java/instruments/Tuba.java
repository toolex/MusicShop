package instruments;

import enums.Family;

public class Tuba extends Instrument {
    public Tuba(String name, Family family, Double priceBought, Double salePrice) {
        super(name, family, priceBought, salePrice);
    }

    public String play() {
        return "Parp!";
    }
}
