import java.util.Scanner;

public class DriverDate {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Year for Date 1: ");
		int h = input.nextInt();
		System.out.print("Enter Month for Date 1: ");
		int m = input.nextInt();
		System.out.print("Enter Days for Date 1:" );
		Date a = new Date(h,m,input.nextInt());
		
		Date a1 = new Date(a);
		
		for(int i=0; i<9; i++) a.incMonth();
		a1.incDay();
		
		a.displayDate();
		a1.displayDate();
		
	}	
	
	
}