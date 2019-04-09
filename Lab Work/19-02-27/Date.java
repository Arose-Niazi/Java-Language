public class Date
{
	private int days;
	private int month;
	private int years;
	private static final int LIMIT[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	

	
	public Date(int years,int month,int days)
	{
		setYears(years);
		setMonth(month);
		setDays(days);
	}
	
	public Date(Date date)
	{
		setYears(date.getYear());
		setMonth(date.getMonth());
		setDays(date.getDay());
	}
	
	public void displayDate()
	{
		System.out.printf("Displaying info of the Date:\n" +
							"\t" + "%02d/%02d/%02d" + "\n",getDay(),getMonth(),getYear()
		);
	}
	
	public void incYear()
	{
		setYears(getYear() + 1);
		setDays(getDay());
	}
	
	public void incMonth()
	{
		//setMonth(getMonth() + 1);
		setDays(LIMIT[getMonth()] + getDay() + 
			((getYear() % 4 == 0)? ( (getMonth() == 2)? 1:0):0)  
		);
	}
	
	public void incDay()
	{
		setDays(getDay() + 1);
	}
	
	public int getYear()
	{
		return years;
	}
	
	public void setYears(int years)
	{
		this.years = years;	
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setMonth(int month)
	{
		this.month = month;
		while (this.month > 12)
		{
			this.month-=12;
			incYear();
		}	
	}
	
	public int getDay()
	{
		return days;
	}
	
	public void setDays(int days)
	{
		this.days = days;
		while (this.days > LIMIT[getMonth()] + ((getYear() % 4 == 0)? ( (getMonth() == 2)? 1:0):0 ))
		{
			this.days-=LIMIT[getMonth()]+((getYear() % 4 == 0)? ( (getMonth() == 2)? 1:0):0 );
			setMonth(getMonth() + 1);;
		}
	}
}