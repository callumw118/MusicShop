package instruments;

public class DrumKit implements IPlay{

    private int bassDrums;
    private int cymbols;
    private int toms;

    public DrumKit(int bassDrums, int cymbols, int toms) {
        this.bassDrums = bassDrums;
        this.cymbols = cymbols;
        this.toms = toms;
    }

    public int getBassDrums() {
        return bassDrums;
    }

    public int getCymbols() {
        return cymbols;
    }

    public int getToms() {
        return toms;
    }

    public String play(){
        return "Ts ts drrr bum bum diddlydooboomboom";
    }
}
