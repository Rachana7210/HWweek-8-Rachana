package methodoverriding24;

//creating child classes.
public class SBI extends Bank {
    @Override
    public int getRateOfInterest() {
        return 8;

    }
}
