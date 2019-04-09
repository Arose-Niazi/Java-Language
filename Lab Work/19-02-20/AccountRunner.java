import java.util.Scanner;
import java.io.*; 
import java.util.*;

public class AccountRunner {
	
	static LinkedList<Account> accounts = new LinkedList<Account>();
	
	
	public static void main(String args[])
	{
		LoadFromFile();
		Menu();
	}	
	
	public static void Menu()
	{
		
		System.out.println("\n\nPlease select an option:");
		System.out.println("1 - Enter an account.");
		System.out.println("2 - Select account.");
		System.out.println("3 - Display all accounts.");
		System.out.println("4 - End program.");
		System.out.print("Your selection: ");
		Scanner s = new Scanner(System.in);
		switch(s.nextInt())
		{
			case 1:
			
				NewAccountMenu();
				Menu();
				break;
			case 2:
				
				if(accounts.size() > 0)
				{	
					for(;;)
					{	
						System.out.print("Enter Account name: ");
						if(SelectAccount(s.nextLine()))
						{
							break;
						}
					}
				}
				else System.out.println("No Accounts!\n");
				Menu();
				break;
			case 3:
				for(int i=0; i<accounts.size(); i++)
				{
					Account acc = accounts.get(i);
					acc.displayAccount();
				}
				System.out.println("");
				Menu();
				break;
			case 4:
				SaveToFile();
				break;
			default:
				System.out.println("Invalid Option\n");
				Menu();
		}
	
	}
	
	public static void NewAccountMenu()
	{
		System.out.println("\n\nPlease select an option:");
		System.out.println("1 - Enter name.");
		System.out.println("2 - Enter name and balance.");
		System.out.println("3 - Go back.");
		System.out.print("Your selection: ");
		Scanner s = new Scanner(System.in);
		switch(s.nextInt())
		{
			case 1:
			
				System.out.printf("Enter Account name for account %d: ",accounts.size()+1 );
				s.nextLine();
				Account acc = new Account(s.nextLine());
				accounts.add(acc); 
				NewAccountMenu();
				break;
			case 2:
				System.out.printf("Enter Account name for account %d: ",accounts.size()+1 );
				s.nextLine();
				String name = s.nextLine();
				System.out.printf("Enter Account balance for account %d: ",accounts.size()+1 );
				double d=s.nextDouble();
				Account acc2 = new Account(name,d);
				accounts.add(acc2); 
				NewAccountMenu();
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid Option\n");
				NewAccountMenu();
		}
	}
	
	public static boolean SelectAccount(String name)
	{
		for(int i=0; i<accounts.size(); i++)
		{
			Account acc = accounts.get(i);
			if(name.equals(acc.getName()))
			{
				AccountMenu(i);
				return true;
			}
		}
		return false;
	}
	
	public static void AccountMenu(int i)
	{
		Account a = accounts.get(i);
		System.out.println("\n\nPlease select an option:");
		System.out.println("1 - Display Account.");
		System.out.println("2 - Deposit.");
		System.out.println("3 - Withdraw.");
		System.out.println("4 - Remove Account.");
		System.out.println("5 - Main Menu.");
		System.out.print("Your selection: ");
		Scanner s = new Scanner(System.in);
		switch(s.nextInt())
		{
			case 1:
				a.displayAccount();
				AccountMenu(i);
				break;
			case 2:
				for(; ;)
				{
					System.out.print("Enter balance to deposit: " );
					if(!a.depositToAccount(s.nextDouble())) System.out.println("Invalid Amount!");
					else break;
				}
				AccountMenu(i);
				break;
			case 3:
				for(; ;)
				{
					System.out.print("Enter balance to withdraw: " );
					if(!a.withdrawToAccount(s.nextDouble())) System.out.println("Invalid Amount!");
					else break;
				}
				AccountMenu(i);
				break;
			case 4:
				accounts.remove(i);
				System.out.println("Account Removed!");
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid Option\n");
				AccountMenu(i);
		}
	}
	
	public static void SaveToFile()
	{
		
		try {
			FileOutputStream fileOut =
			new FileOutputStream("Data/Accounts.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			for(int i=0; i<accounts.size(); i++)
			{
				Account acc = accounts.get(i);
			}
			out.close();
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
	
	public static void LoadFromFile()
	{
		try {
			FileInputStream fileIn = new FileInputStream("Data/Accounts.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			boolean a=true;
			while(a)
			{
				accounts.add((Account) in.readObject());
			}	
			in.close();
			fileIn.close();
		} catch (EOFException xxx) {
			
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Account class not found");
			c.printStackTrace();
			return;
		} finally {
			return;
		}
		
	}
	
}