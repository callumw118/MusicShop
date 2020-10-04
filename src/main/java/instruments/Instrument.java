package instruments;

import shop.ISell;

public abstract class Instrument implements IPlay {

    private String material;
    private String type;

    public Instrument(String material, String type) {
        this.material = material;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }
}
