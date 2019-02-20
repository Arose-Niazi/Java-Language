public class Account implements java.io.Serializable
{
	private double balance;
	private String name;
	
	public Account(String name)
	{
		setName(name);
		setBalance(500.0);
	}
	
	
	public Account(String name,double balance)
	{
		setName(name);
		setBalance(balance);
	}
	
	public Account(Account acc)
	{
		setName(acc.getName());
		setBalance(acc.getBalance());
	}
	
	public void displayAccount()
	{
		System.out.println("Displaying info of the account:\n" +
							"\t" + "Name: " + getName() + "\n" +
							"\t" + "Balance: " + getBalance() + "\n"
		);
	}
	
	public boolean depositToAccount(double amount)
	{
		if(amount > 0.0)
		{
			balance+=amount;
			return true;
		}
		else return false;
	}
	
	public boolean withdrawToAccount(double amount)
	{
		if(amount > 0.0 && getBalance() >= amount)
		{
			balance-=amount;
			return true;
		}
		else return false;
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
		if(balance > 0.0)
			this.balance = balance;
			
	}
}