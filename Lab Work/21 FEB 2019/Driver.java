import java.util.Scanner;

public class Driver {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		Time a = new Time();
		
		System.out.print("Enter Hours for Time 2: ");
		Time a1 = new Time(input.nextInt());
		
		System.out.print("Enter Hours for Time 3: ");
		int h = input.nextInt();
		System.out.print("Enter Minutes for Time 3:" );
		Time a2 = new Time(h,input.nextInt());
		
		System.out.print("Enter Hours for Time 4: ");
		h = input.nextInt();
		System.out.print("Enter Minutes for Time 4: ");
		int m = input.nextInt();
		System.out.print("Enter Seconds for Time 4:" );
		Time a3 = new Time(h,m,input.nextInt());
		
		Time a4 = new Time(a3);
		for(int i=0; i<(int) (Math.random() * 100); i++)
		{
			a.incHour();
			a.incMin();
			a.incSeconds();
		}	
		for(int i=0; i<(int) (Math.random() * 100); i++)
		{
			a1.incHour();
			a1.incMin();
			a1.incSeconds();
		}	
		for(int i=0; i<(int) (Math.random() * 100); i++)
		{
			a2.incHour();
			a2.incMin();
			a2.incSeconds();
		}	
		for(int i=0; i<(int) (Math.random() * 100); i++)
		{
			a3.incHour();
			a3.incMin();
			a3.incSeconds();
		}	
		for(int i=0; i<(int) (Math.random() * 100); i++)
		{
			a4.incHour();
			a4.incMin();
			a4.incSeconds();
		}
		
		a.displayLocal();
		a.displayGlobal();
		
		a1.displayLocal();
		a1.displayGlobal();
		
		a2.displayLocal();
		a2.displayGlobal();
		
		a3.displayLocal();
		a3.displayGlobal();
		
		a4.displayLocal();
		a4.displayGlobal();
	}	
	
	
}