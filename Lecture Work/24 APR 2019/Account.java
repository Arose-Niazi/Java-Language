public abstract class Account implements Payable {
	private String AccName;
	private int AccID;
	private double balance;
	
	public Account(String AccName,int AccID, double balance)
	{
		this.AccName=AccName;
		this.AccID=AccID;
		this.balance=balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return String.format("Account Info\n\tName: %s\n\tID: %d\n\tBalance: %f\n",AccName,AccID,balance);
	}
}