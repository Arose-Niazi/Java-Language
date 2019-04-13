public class EmployeeDriver {
    public static void main(String args[]) {
        BasePlusComE a = new BasePlusComE("Ali", 23, 1, 50.0, 1500.0, 35000.0);
        HourlyEmployee b = new HourlyEmployee("Hamza", 22, 2, 25.0, 500.0);

        System.out.println(a);
        System.out.println("");
        System.out.println(b);
    }
}
