import accessories.Accessory;
import accessories.GuitarString;
import behaviours.IDealable;
import behaviours.ISell;
import instruments.Guitar;
import instruments.Instrument;

import java.util.ArrayList;

public class MusicShop {
    private String name;
    private ArrayList<ISell> stock;
    private Double cashInRegister;
    private ArrayList<IDealable> itemsOnSale;

    public MusicShop(String name, Double cashInRegister){
        this.name = name;
        this.cashInRegister = cashInRegister;
        this.stock = new ArrayList<ISell>();
        this.itemsOnSale = new ArrayList<IDealable>();
    }

    public String getName() {
        return name;
    }

    public Double getCashInRegister() {
        return cashInRegister;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setCashInRegister(Double cashInRegister) {
        this.cashInRegister = cashInRegister;
    }

    public ArrayList<IDealable> getItemsOnSale() {
        return itemsOnSale;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItemToStock(ISell item) {
        cashInRegister -= item.getPriceBought();
        stock.add(item);
    }

    public void sellItem(ISell item) {
        if (stock.contains(item)){
            cashInRegister += item.getSalePrice();
            stock.remove(item);
        }
    }

    public double calculateTotalMarkup() {
        Double total = 0.0;
        for (ISell item : stock){
            total += item.markUp();
        }
        return total;
    }

    public void addItemFromStockToDealList(IDealable item) {
        if (stock.contains(item)){
            itemsOnSale.add(item);
            stock.remove(item);
        }
    }

    public void putItemsOnSale() {
        ISell itemToPutBackIntoStock = null;
        for (IDealable item : itemsOnSale){
            item.deal();
            itemToPutBackIntoStock = (ISell) item;
            stock.add(itemToPutBackIntoStock);
        }
    }

}
