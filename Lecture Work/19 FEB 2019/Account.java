public class Account 
{
	private double balance;
	private String name;
	
	public Account()
	{
		name = "Empty Account";
		balance = 0.0;
	}
	
	public Account(double bal, String nm)
	{
		name = nm;
		balance = bal;
	}
	
	public Account(Account ac)
	{
		name = ac.getName();
		balance = ac.getBalance();
	}
	
	public void setAccount()
	{
		name = "Empty Account";
		balance = 0.0;
	}
	
	public void setAccount(String nm, double bal)
	{
		name = nm;
		balance = bal;
	}
	
	public void displayAccount()
	{
		System.out.println("Displaying info of the account:\n" +
							"\t" + "Name: " + getName() + "\n" +
							"\t" + "Balance: " + getBalance() + "\n"
		);
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
}