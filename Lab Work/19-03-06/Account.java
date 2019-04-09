import java.util.ArrayList;
public class Account implements java.io.Serializable
{
	private double balance;
	private String name;
	private ArrayList<Double> transactionAmounts;
	
	public Account(String name)
	{
		setName(name);
		setBalance(500.0);
	}
	
	
	public Account(String name,double balance)
	{
		setName(name);
		setBalance(balance);
		transactionAmounts = new ArrayList<Double>();
	}
	
	public Account(Account acc)
	{
		setName(acc.getName());
		setBalance(acc.getBalance());
		transactionAmounts = getTransactionAmounts();
	}
	
	public void displayAccount()
	{
		System.out.println("Displaying info of the account:\n" +
							"\t" + "Name: " + getName() + "\n" +
							"\t" + "Balance: " + getBalance() + "\n" +
							"\t" + "Transactions: " + getTransactionAmounts() + "\n" +
							"\t" + "Transactional Balance: " + computeTransactionBalance()
		);
		printCreditTransaction();
	}
	
	public boolean depositToAccount(double amount)
	{
		if(amount > 0.0)
		{
			balance+=amount;
			updateTransaction(+amount);
			return true;
		}
		else return false;
	}
	
	public boolean withdrawToAccount(double amount)
	{
		if(amount > 0.0 && getBalance() >= amount)
		{
			balance-=amount;
			updateTransaction(-amount);
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
	
	public ArrayList<Double> getTransactionAmounts()
	{
		return transactionAmounts;
	}
	
	public void setTransactionAmounts(ArrayList<Double> transactionAmounts)
	{
		this.transactionAmounts = transactionAmounts;	
	}
	
	private void updateTransaction(double balance)
	{
		if(transactionAmounts.size() > 4)
		{
			for(int i=0; i<4; i++)
			{
				transactionAmounts.set(i,transactionAmounts.get(i+1));
			}
			transactionAmounts.set(4,balance);
			
		}
		else transactionAmounts.add(balance);
	}
	
	public double computeTransactionBalance()
	{
		double balance=0.0;
		for(Double d: transactionAmounts) balance+=d;
		return balance;
	}
	
	public void printCreditTransaction()
	{
		double balance=0.0;
		System.out.println("\tPrinting Credit Transcations:");
		for(Double d: transactionAmounts) if(d > 0) System.out.println("\t\t" + (d));;
	}
}