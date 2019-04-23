public class SavingAccount extends Account {
	private double interest;
	public SavingAccount(String AccName,int AccID, double balance, double interest)
	{
		super(AccName,AccID,balance);
		this.interest = interest;
	}
	
	public String toString()
	{
		return String.format("%s\tSavings Account\n\t\tInterest: %f\n",super.toString(),interest);
	}
	
	public void deposit(double val)
	{
		setBalance(getBalance()+val);
	}
	
	public double withdraw(double val)
	{
		setBalance(getBalance()-val);
		return val;
	}
}