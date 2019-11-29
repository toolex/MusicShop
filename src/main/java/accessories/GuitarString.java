package accessories;

import behaviours.IDealable;

public class GuitarString extends Accessory implements IDealable {
    public GuitarString(String name, Double priceBought, Double salePrice) {
        super(name, priceBought, salePrice);
    }

    public void deal() {

    }
}
