import java.util.Scanner;

public class Fifth {
	
	public static void main(String args[])
	{
		Menu();
	}
	private static void Menu()
	{
		System.out.println("\n\nPlease select an option:");
		System.out.println("1 - Number printer.");
		System.out.println("2 - Biggest Integer.");
		System.out.println("3 - 10 Years profit.");
		System.out.println("4 - End program.");
		System.out.print("Your selection: ");
		Scanner s = new Scanner(System.in);
		switch(s.nextInt())
		{
			case 1:
				NumberPrinter();
				Menu();
				break;
			case 2:
				BiggestNumber();
				Menu();
				break;
			case 3:
				ProfitCalculator();
				Menu();
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid Option\n");
				Menu();
				
		}
		
	}
	private static void ProfitCalculator()
	{
		System.out.println("");
		Double money = (Double) 1000.0;
		Double profit = (Double) 0.05;
		for(int i=0; i<=9; i++)
		{
			System.out.printf("Year - %d\tMoney - %.3f\tProfit - %.1f\tAfter Profit - %.3f\n",i+1,money,profit*100.0,money+=profit*money);
		}
	}
	private static void BiggestNumber()
	{
		System.out.println("");
		Scanner s = new Scanner(System.in);
		int biggest = 0;
		Integer[] number = new Integer[5] ;
		for(int i=0; i<5; i++)
		{
			System.out.printf("Enter number %d: ",i+1);
			number[i] = s.nextInt();
			if(i == 0)
			{
				biggest = number[i];
			}
			else
			{
				if(biggest < number[i]) biggest = number[i];
			}
		}
		System.out.println("Biggest number: "+ biggest);
	}
	private static void NumberPrinter()
	{
		System.out.println("");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number between 0-9: ");
		int number = s.nextInt();
		switch(number)
		{
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;	
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			default:
				System.out.println("Invalid Number");
				NumberPrinter();
		}
	}

}