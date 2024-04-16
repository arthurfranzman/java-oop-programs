public class Serf extends Peasant {
    public Serf() {
    }
    public int taxableIncome() {;
        int taxed = income - 12;
        if (taxed <= 0) {
            return 0;
        } else {
            return taxed;
        }
    }
    
    @Override
    public int tax() {
        return taxCalculator();
    }
}