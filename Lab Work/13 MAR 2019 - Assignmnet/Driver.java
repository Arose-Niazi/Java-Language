import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) 
	{
		ArrayList <City> cities = new ArrayList<City>();
		Menu(cities);
	}

	public static void Menu(ArrayList<City> cities) 
	{
		System.out.println("\n\nPlease select an option: ");
		System.out.println("1 - Add City.");
		System.out.println("2 - Print City Info.");
		System.out.println("3 - Print Maximum Population.");
		System.out.println("4 - Remove City.");
		System.out.println("5 - Exit.");
		System.out.print("Enter your selection: ");
		Scanner input = new Scanner(System.in);
		switch( input.nextInt())
		{
			case 1: 
				System.out.print("Enter City Name: ");
				input.nextLine();
				String name = input.nextLine();
				System.out.print("Enter City Population: ");
				cities.add(new City(name,input.nextInt(),500,false));
				break;
			case 2:
				for(City x: cities)
				{
					System.out.println(x);
				}
				break;
			case 3: 
				System.out.println("\nMax Population: " + City.getMaxPopulation());
				break;
			case 4: 
				System.out.print("Enter City Name to Remove: ");
				input.nextLine();
				name = input.nextLine();
				for(City x: cities)
				{
					if(name.equals(x.getCityName()))
					{
						cities.remove(x);
						System.out.println("City has been removed!");
						City.setTotalCities(City.getTotalCities()-1);
						break;
					}
				}
				break;
			case 5: 
				System.exit(0);
				break;
			default: {
				System.out.println("Invalid Option!");
			}
		}
		Menu(cities);
	}
}