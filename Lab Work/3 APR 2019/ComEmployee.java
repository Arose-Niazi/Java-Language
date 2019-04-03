package LAB;

public class ComEmployee extends  Employee{
    private double sales;
    private double rate;

    public ComEmployee(String name, int age, int empID, double sales, double rate) {
        super(name, age, empID);
        this.sales = sales;
        this.rate = rate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double earnings() {
        return sales * rate + super.earnings();
    }

    @Override
    public String toString() {
        return super.toString() + "\nComEmployee{" +
                "sales=" + sales +
                ", rate=" + rate +
                '}';
    }
}
