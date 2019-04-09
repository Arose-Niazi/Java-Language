import java.util.Scanner;

public class Driver {
	
	public static void main(String args[])
	{
		Menu(args);
	}
	private static void Menu(String args[])
	{
		System.out.println("\n\nPlease select an option:");
		System.out.println("1 - Student.");
		System.out.println("2 - Employee.");
		System.out.println("3 - End program.");
		System.out.print("Your selection: ");
		Scanner s = new Scanner(System.in);
		switch(s.nextInt())
		{
			case 1:
				DriverStudent.main(args);
				Menu(args);
				break;
			case 2:
				EmpTest.main(args);
				Menu(args);
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid Option\n");
				Menu(args);
				
		}
		
	}
}