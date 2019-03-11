import java.util.ArrayList;

public class Driver
{
	public static void main(String args[])
	{
		ArrayList<Medicine> m = new ArrayList<Medicine>();
		m.add(new Medicine("Panadol",new Date(5,3,2007),new Date(5,3,2000),50.0));
		m.add(new Medicine("Kalricid",new Date(2,3,2005),new Date(4,4,2000),500.0));
		
		Billing b = new Billing(50.0,250.0,new Date(5,3,2004),m);
		System.out.println(b);
	}
}