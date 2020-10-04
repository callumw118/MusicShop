import org.junit.Before;
import org.junit.Test;
import shop.GuitarToSell;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;

    @Before
    public void before(){
        shop = new Shop();
    }

    @Test
    public void canAddToStock(){
        assertEquals(0, shop.getStock().size());
        GuitarToSell guitar = new GuitarToSell("Electric", 100, 200);
        shop.addToStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock(){
        assertEquals(0, shop.getStock().size());
        GuitarToSell guitar = new GuitarToSell("Electric", 100, 200);
        shop.addToStock(guitar);
        assertEquals(1, shop.getStock().size());
        shop.removeFromStock(guitar);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canGetTotalProfit(){
        GuitarToSell guitar = new GuitarToSell("Electric", 100, 200);
        shop.addToStock(guitar);
        assertEquals(100, shop.getTotalProfit());
    }
}
