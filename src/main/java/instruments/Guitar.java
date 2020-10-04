package instruments;

public class Guitar {

    private int numberOfStrings;

    public Guitar(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    public String play(){
        return "Strummy strum strum dum dum dum";
    }
}
