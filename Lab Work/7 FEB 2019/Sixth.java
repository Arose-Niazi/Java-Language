import java.util.Scanner;

public class Sixth {
	
	public static void main(String args[])
	{
		Menu(args);
	}
	private static void Menu(String args[])
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
				Second.main(args);
				Menu(args);
				break;
			case 2:
				Third.main(args);
				Menu(args);
				break;
			case 3:
				Fourth.main(args);
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