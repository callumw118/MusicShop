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

    public int getTotalProfit(){
        int total = 0;
        for(ISell item : this.stock){
            total += item.calculateMarkup();
        }
        return total;
    }

}
