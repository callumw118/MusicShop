package shop;

public class GuitarToSell implements ISell{

    private String type;
    private double costToShop;
    private double priceToSell;

    public GuitarToSell(String type, double costToShop, double priceToSell) {
        this.type = type;
        this.costToShop = costToShop;
        this.priceToSell = priceToSell;
    }

    public double calculateMarkup(){
        return priceToSell - costToShop;
    }
}
