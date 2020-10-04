import instruments.DrumKit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    private DrumKit drumKit;

    @Before
    public void before(){
        drumKit = new DrumKit("Wood", "Acoustic", 2, 6, 5);
    }

    @Test
    public void canPlay(){
        assertEquals("Ts ts drrr bum bum diddlydooboomboom", drumKit.play());
    }
}
