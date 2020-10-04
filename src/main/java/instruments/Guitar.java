package instruments;

public class Guitar implements IPlay{

    private int numberOfStrings;

    public Guitar(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "Strummy strum strum dum dum dum";
    }
}
