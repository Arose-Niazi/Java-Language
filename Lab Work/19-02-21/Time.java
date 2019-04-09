public class Time
{
	private int seconds;
	private int minutes;
	private int hours;
	
	public Time()
	{

	}
	
	
	public Time(int hours)
	{
		setHours(hours);
	}
	
	public Time(int hours,int minutes)
	{
		setHours(hours);
		setMinutes(minutes);
	}
	
	public Time(int hours,int minutes,int seconds)
	{
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
	}
	
	public Time(Time time)
	{
		setHours(time.getHours());
		setMinutes(time.getMinutes());
		setSeconds(time.getSeconds());
	}
	
	public void displayLocal()
	{
		System.out.printf("Displaying info of the time:\n" +
							"\t" + "%02d:%02d:%02d" + ((getHours() > 12)? " PM": " AM") + "\n",((getHours() > 12)? getHours()-12: getHours()),getMinutes(),getSeconds()
		);
	}
	
	public void displayGlobal()
	{
		System.out.printf("Displaying info of the time:\n" +
							"\t" + "%02d:%02d:%02d" + "\n", getHours(),getMinutes(),getSeconds()
		);
	}
	
	public void incHour()
	{
		setHours(getHours() + 1);
	}
	
	public void incMin()
	{
		setMinutes(getMinutes() + 1);
	}
	
	public void incSeconds()
	{
		setSeconds(getSeconds() + 1);
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public void setHours(int hours)
	{
		this.hours = hours;
		while (this.hours > 23)
		{
			this.hours-=24;
		}	
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	
	public void setMinutes(int minutes)
	{
		this.minutes = minutes;
		while (this.minutes > 59)
		{
			this.minutes-=60;
			incHour();
		}	
	}
	
	public int getSeconds()
	{
		return seconds;
	}
	
	public void setSeconds(int seconds)
	{
		this.seconds = seconds;
		while (this.seconds > 59)
		{
			this.seconds-=60;
			incMin();
		}
	}
}