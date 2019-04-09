public class Distance
{
	private int feet;
	private int inch;
	
	public Distance()
	{
		setFeet(0);
		setInch(0);
	}
	
	public Distance(int feet,int inch)
	{
		setFeet(feet);
		setInch(inch);
	}
	
	public void printDistance()
	{	
		System.out.print("Printing Distance:\n\t");
		for(int i=0; i<getFeet(); i++)
			System.out.print("****** ");
		for(int i=0; i<getInch(); i++)
			System.out.print("^");
		System.out.println("\n");
	}
	
	public void addInches(int inches)
	{
		setInch(getInch() + inches);
	}
	
	public int getFeet()
	{
		return feet;
	}
	
	public void setFeet(int feet)
	{
		this.feet = feet;	
	}
	
	public int getInch()
	{
		return inch;
	}
	
	public void setInch(int inch)
	{
		this.inch = inch;
		while (this.inch > 11)
		{
			this.inch-=12;
			setFeet(getFeet() + 1);
		}	
	}
	
}