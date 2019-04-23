public class Driver {

	public static void main(String args[])
	{
		Payable p[] = new Payable[2];
		
		p[0] = new SavingAccount("Arose",1,50000.0,5.0);
		p[1] = new CurrentAccount("Niazi", 2 ,80000.0);
		System.out.println("Accounts After Creating");
		for(Payable x: p)
		{
			System.out.println(x);
		}
		System.out.println("Accounts After Deposit 5000.0");
		for(Payable x: p)
		{
			x.deposit(5000.0);
			System.out.println(x);
		}
		System.out.println("Accounts After withdraw 50000.0");
		for(Payable x: p)
		{
			x.withdraw(50000.0);
			System.out.println(x);
		}		
		
	}
}