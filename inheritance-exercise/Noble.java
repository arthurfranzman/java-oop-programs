public class Noble extends Inhabitant {
    public Noble() {
    }
    public int tax() {
        int tax = taxCalculator();
        if (tax >= 20) {
            return tax;
        } else {
            return 20;
        }
    }
}