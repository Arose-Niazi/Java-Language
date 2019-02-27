import java.util.Scanner;

public class DriverDistance {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Feet for Distance 1: ");
		int h = input.nextInt();
		System.out.print("Enter Inch for Distance 1: ");
		int m = input.nextInt();
		Distance a = new Distance(h,m);
		
		Distance a1 = new Distance();
		
		System.out.print("Enter inches to add in distance 1: ");
		a.addInches(input.nextInt());
		
		System.out.print("Enter inches to add in distance 2: ");
		a1.addInches(input.nextInt());
		
		a.printDistance();
		a1.printDistance();
		
	}	
	
	
}