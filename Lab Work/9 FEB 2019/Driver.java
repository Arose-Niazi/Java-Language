import java.util.Scanner;
public class Driver {
	public static void main(String args[])
	{
		Menu();
	}	
	
	public static void Menu()
	{
		System.out.println("\n\nPlease select an option:");
		System.out.println("1 - Circle.");
		System.out.println("2 - Rectangle.");
		System.out.println("3 - End program.");
		System.out.print("Your selection: ");
		Scanner s = new Scanner(System.in);
		switch(s.nextInt())
		{
			case 1:
				System.out.print("\nEnter radius: ");
				Circle circle = new Circle();
				circle.setRadius(s.nextDouble());
				circle.Display();
				System.out.println("");
				Menu();
				break;
			case 2:
				System.out.print("\nEnter Lenght: ");
				Rectangle rectangle = new Rectangle();
				rectangle.setLength(s.nextDouble());
				System.out.print("Enter Width: ");
				rectangle.setWidth(s.nextDouble());
				System.out.println("");
				rectangle.Display();
				Menu();
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid Option\n");
				Menu();
		}
	}
	
	
}