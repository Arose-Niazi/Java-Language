import java.util.ArrayList;

public class Test 
{
	public static void main(String args[])
	{
		ArrayList<Building> buildings = new ArrayList<Building>();
		Building b1 = new Building("OOP Home", 250,15);
		Location l1 = new Location();
		l1.setLatitude(33.5);
		l1.setLongitude(42.0);
		b1.setBuildingLocation(l1);
		
		Building b2 = new Building("Informa Heights", 400,20);
		Location l2 = new Location();
		l2.setLatitude(34.0);
		l2.setLongitude(44.0);
		b2.setBuildingLocation(l2);
		
		buildings.add(b1);
		buildings.add(b2);
		
		for(Building x: buildings)
		{
			System.out.println(x.getName() + " is " + ((x.getRegistrationStatus())? "registered": "not registered") + " with LDA");
		}
		System.out.println("Total Buildings: " + Building.getTotalBuilding());
	}
}