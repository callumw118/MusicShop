package instruments;

public class DrumKit extends Instrument {

    private int bassDrums;
    private int cymbols;
    private int toms;

    public DrumKit(String material, String type, int bassDrums, int cymbols, int toms) {
        super(material, type);
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

    public double calculateMarkup() {
        return 0;
    }
}
