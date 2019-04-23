public class CurrentAccount extends Account {
	private double initalBal;
	public CurrentAccount(String AccName,int AccID, double initalBal)
	{
		super(AccName,AccID,initalBal);
		this.initalBal = initalBal;
	}
	
	public String toString()
	{
		return String.format("%s\tCurrent Account\n\tInital Balance: %f\n",super.toString(),initalBal);
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