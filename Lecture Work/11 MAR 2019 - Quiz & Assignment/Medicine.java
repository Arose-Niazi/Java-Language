public class Medicine
{
	private String medName;
	private Date medExp;
	private Date medMfg;
	private double medPrice;
	
	public Medicine(String medName,Date medExp,Date medMfg,double medPrice)
	{
		this.medName= medName;
		this.medExp = medExp;
		this.medMfg = medMfg;
		this.medPrice = medPrice;
	}
	
	public String toString()
	{
		return ("\tName: " + medName + 
				"\n\t\tManufacture Date: "	+ medMfg + 
				"\n\t\tExpiry Date: " + medExp +
				"\n\t\tPrice: " + medPrice);
	}
	
	public double getMedPrice()
	{
		return medPrice;
	}
}