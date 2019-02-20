import java.util.Scanner;

public class Driver {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Account name for account 1:" );
		Account a1 = new Account(input.nextLine());
		
		System.out.print("Enter Account name for account 2:" );
		String name = input.nextLine();
		System.out.print("Enter Account balance for account 2:" );
		Account a2 = new Account(name,input.nextDouble());
		
		Account a3 = new Account(a2);
		
		a1.displayAccount();
		a2.displayAccount();
		a3.displayAccount();
		for(; ;)
		{
			System.out.print("Enter balance to deposit in account 1:" );
			if(!a1.depositToAccount(input.nextDouble())) System.out.println("Invalid Amount!");
			else break;
		}
		for(; ;)
		{
			System.out.print("Enter balance to deposit in account 2:" );
			if(!a2.depositToAccount(input.nextDouble())) System.out.println("Invalid Amount!");
			else break;
		}
		for(; ;)
		{
			System.out.print("Enter balance to deposit in account 3:" );
			if(!a3.depositToAccount(input.nextDouble())) System.out.println("Invalid Amount!");
			else break;
		}
		
		a1.displayAccount();
		a2.displayAccount();
		a3.displayAccount();
		
		for(; ;)
		{
			System.out.print("Enter balance to widthdraw from account 1:" );
			if(!a1.withdrawToAccount(input.nextDouble())) System.out.println("Invalid Amount!");
			else break;
		}
		for(; ;)
		{
			System.out.print("Enter balance to widthdraw from account 2:" );
			if(!a2.withdrawToAccount(input.nextDouble())) System.out.println("Invalid Amount!");
			else break;
		}
		for(; ;)
		{
			System.out.print("Enter balance to widthdraw from account 3:" );
			if(!a3.withdrawToAccount(input.nextDouble())) System.out.println("Invalid Amount!");
			else break;
		}
		
		a1.displayAccount();
		a2.displayAccount();
		a3.displayAccount();
	}	
	
	
}