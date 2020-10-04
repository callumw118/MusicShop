package instruments;

public class Guitar extends Instrument implements IPlay{

    private int numberOfStrings;

    public Guitar(String material, String type, int numberOfStrings){
        super(material, type);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "Strummy strum strum dum dum dum";
    }
}
