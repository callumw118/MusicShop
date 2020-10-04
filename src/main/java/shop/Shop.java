package shop;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell item){
        stock.add(item);
    }

    public void removeFromStock(ISell item){
        stock.remove(item);
    }
}
