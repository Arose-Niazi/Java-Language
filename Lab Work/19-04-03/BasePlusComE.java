public class BasePlusComE extends ComEmployee {
    private double baseSalary;

    public BasePlusComE(String name, int age, int empID, double sales, double rate, double baseSalary) {
        super(name, age, empID, sales, rate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBasePlusComE{" +
                "baseSalary=" + baseSalary +
                '}' + "\nEarnings = " + earnings();
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }
}
