import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Zebra Wood", "Electric", 7);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Zebra Wood", guitar.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(7, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlayGuitar(){
        assertEquals("Strummy strum strum dum dum dum", guitar.play());
    }
}
