package behaviours;

public interface ISell {
     void setPriceBought(Double newPrice);

     void setSalePrice(Double newPrice);

     Double markUp();

     Double getPriceBought();

     Double getSalePrice();
}
