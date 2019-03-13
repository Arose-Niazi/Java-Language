public class City {
	private String cityName;
	private int cityPopulation;
	private int cityVoters;
	private boolean isCapital;
	private static int maxPopulation;

	public City(String cityName, int cityPopulation, int cityVoters, boolean isCapital) 
	{
		this.cityName = cityName;
		this.cityPopulation = cityPopulation;
		this.cityVoters = cityVoters;
		this.isCapital = isCapital;
		if(maxPopulation < cityPopulation) maxPopulation=cityPopulation;
	}

	public String getCityName()
	{
		return cityName;
	}
	
	public static int getMaxPopulation()
	{
		return maxPopulation;
	}

	public String toString()
	{
		return String.format("\nCity Info:\n\tName: %s\n\tPopulation: %d\n\tVoters: %d\n\tCapital: %s",cityName,cityPopulation,cityVoters,(isCapital)?"Yes":"No");
	}
}