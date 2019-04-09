public class Employee
{
	private double salary;
	private double netMonthlyIncome;
	
	private static double annualTaxRate;
	private static double inflationRate= 0.3;
	
	
	public Employee()
	{
		setSalary(5000);
		//computeNetSalary(); //According to question it is required here, but this leave behind some loop holes in our program.
	}
	
	public Employee(double salary)
	{
		setSalary(salary);
		//computeNetSalary(); //According to question it is required here, but this leave behind some loop holes in our program.
	}
	
	static 
	{
		annualTaxRate= (inflationRate > 0.5)? 5.0 : 10.0;
	}
	
	public double computeAnnualTax()
	{
		return ((salary * 12) * (annualTaxRate/100.0));
		
	}
	
	public void computeNetSalary()
	{
		netMonthlyIncome = (salary - (computeAnnualTax()/12.0));
	}
	
	public double getNetMonthlyIncome() //Added extra not required in question
	{
		return netMonthlyIncome;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
		computeNetSalary(); //Not required in question, but this way fixes the loop hole.
	}
	
	
}