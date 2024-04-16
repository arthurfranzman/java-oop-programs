public class Inhabitant {
    protected int income;
    public double taxable;
    public Inhabitant() {
    }
    public void setIncome(int income) {
        if (income < 0) {
            throw new IllegalArgumentException();
        } else {
            this.income = income;
        }
    }
    public int taxableIncome() {
        return income;
    }
    
    public int tax() {
        return taxCalculator();
    }
    public int taxCalculator() {
        taxable = income / 10;
        taxable = taxable - 0.5;
        if (taxable <= 1) {
            return 1;
        } else {
            return (int) Math.round(taxable);
        }
    }
}