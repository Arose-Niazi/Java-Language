import java.util.Scanner;

public class BankAccountTest {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Account name:" );
		String name = input.nextLine();
		
		System.out.print("Enter Account balance:" );
		BankAccount a1 = new BankAccount(name,input.nextDouble());
		
		a1.displayAccount();
		
		for(; ;)
		{
			boolean loop=true;
			System.out.print("Enter -1 for Debit, +1 for Credit and 0 to End:" );
			switch(input.nextInt())
			{
				case -1:
					System.out.print("Enter Amount to Withdraw: ");
					if(!a1.withdrawToAccount(input.nextDouble())) System.out.println("Invalid Amount!");
					break;
				case 1:
					System.out.print("Enter Amount to Deposit: ");
					if(!a1.depositToAccount(input.nextDouble())) System.out.println("Invalid Amount!");
					break;
				case 0:
					loop=false;
					break;
				default:
					System.out.println("Invalid Option!");
			}
			if(!loop) break;
		}

		a1.displayAccount();
	}	
}