package instruments;

import behaviours.IDealable;
import behaviours.IPlay;
import behaviours.ISell;
import enums.Family;

public abstract class Instrument implements IPlay, ISell, IDealable {

    private String name;
    private Family family;
    private Double priceBought;
    private Double salePrice;

    public Instrument(String name, Family family, Double priceBought, Double salePrice){
        this.name = name;
        this.family = family;
        this.priceBought = priceBought;
        this.salePrice = salePrice;
    }

    public String getName() {
        return name;
    }

    public Family getFamily() {
        return family;
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

    public void deal(){
        salePrice = (salePrice - salePrice * 0.1);
    }

}
