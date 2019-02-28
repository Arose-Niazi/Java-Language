import java.util.Scanner;

public class EmpTest {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		Employee emp1 = new Employee(20000);
		Employee emp2 = new Employee();
		System.out.print("Enter Salary for Employee 2: ");
		emp2.setSalary(input.nextDouble());
		
		System.out.println("Employee 1:\n"
						+	"\tAnnual Salary: " + emp1.getSalary()*12 
						+	"\tMonthly Income: " + emp1.getNetMonthlyIncome() 
						+	"\tAnnual Tax: " + emp1.computeAnnualTax());
		
		System.out.println("Employee 1:\n"
						+	"\tAnnual Salary: " + emp2.getSalary()*12 
						+	"\tMonthly Income: " + emp2.getNetMonthlyIncome() 
						+	"\tAnnual Tax: " + emp2.computeAnnualTax());		
	}	
	
	
}