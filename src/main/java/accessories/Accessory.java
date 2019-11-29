package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {

    private String name;
    private Double priceBought;
    private Double salePrice;

    public Accessory(String name, Double priceBought, Double salePrice) {
        this.name = name;
        this.priceBought = priceBought;
        this.salePrice = salePrice;
    }

    public String getName() {
        return name;
    }

    public Double getPriceBought() {
        return priceBought;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceBought(Double priceBought) {
        this.priceBought = priceBought;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double markUp(){
        return salePrice - priceBought;
    }
}
