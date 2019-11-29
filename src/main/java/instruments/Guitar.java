package instruments;

import behaviours.IDealable;
import enums.Family;

public class Guitar extends Instrument implements IDealable {
    public Guitar(String name, Family family, Double priceBought, Double salePrice) {
        super(name, family, priceBought, salePrice);
    }

    public String play() {
        return "Strum!";
    }

    public void deal() {

    }
}
