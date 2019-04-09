public class Building 
{
	private String Name;
	private int Height;
	private int numFloors;
	private Location buildingLocation;
	private static int totalBuilding;

	public Building(String Name, int Height, int numFloors)
	{
		buildingLocation = new Location();
		buildingLocation.latitude = 20.5;
		buildingLocation.longitude = 50.0;
		this.Name = Name;
		this.Height = Height;
		this.numFloors = numFloors;
		totalBuilding++;
	}
	
	public boolean getRegistrationStatus()
	{
		
		if(buildingLocation.latitude >= 30.0 && buildingLocation.latitude <= 35.0 && buildingLocation.longitude >= 40.0 && buildingLocation.longitude <= 45.0)
		{
			if(numFloors <= 20 && Height < 300 ) return true;
			if(numFloors >= 25 && numFloors <= 40 && Height > 300) return true;
		}	
		return false;
	}
	
	public void setBuildingLocation(Location buildingLocation)
	{
		this.buildingLocation = buildingLocation;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public static int getTotalBuilding()
	{
		return totalBuilding;
	}
	
}