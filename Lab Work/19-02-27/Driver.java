import java.util.Scanner;

public class Driver {
	
	public static void main(String args[])
	{
		Menu(args);
	}
	private static void Menu(String args[])
	{
		System.out.println("\n\nPlease select an option:");
		System.out.println("1 - Date.");
		System.out.println("2 - Distance.");
		System.out.println("3 - Fraction.");
		System.out.println("4 - End program.");
		System.out.print("Your selection: ");
		Scanner s = new Scanner(System.in);
		switch(s.nextInt())
		{
			case 1:
				DriverDate.main(args);
				Menu(args);
				break;
			case 2:
				DriverDistance.main(args);
				Menu(args);
				break;
			case 3:
				DriverFraction.main(args);
				Menu(args);
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid Option\n");
				Menu(args);
				
		}
		
	}
}