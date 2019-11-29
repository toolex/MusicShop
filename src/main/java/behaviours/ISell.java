package behaviours;

public interface ISell {
    public void setPriceBought(Double newPrice);

    public void setSalePrice(Double newPrice);

    public Double markUp();

    public Double getPriceBought();

    public Double getSalePrice();
}
