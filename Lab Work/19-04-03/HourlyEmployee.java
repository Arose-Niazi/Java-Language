package LAB;

public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double ratePerHour;

    public HourlyEmployee(String name, int age, int empID, double hoursWorked, double ratePerHour) {
        super(name, age, empID);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHourlyEmployee{" +
                "hoursWorked=" + hoursWorked +
                ", ratePerHour=" + ratePerHour +
                '}' + "\nEarnings " +  earnings();
    }

    @Override
    public double earnings() {
        return ratePerHour*hoursWorked +  super.earnings();
    }
}
