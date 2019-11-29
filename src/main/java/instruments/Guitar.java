package instruments;

import enums.Family;

public class Guitar extends Instrument {
    public Guitar(String name, Family family, Double priceBought, Double salePrice) {
        super(name, family, priceBought, salePrice);
    }

    public String play() {
        return "Strum!";
    }
}
