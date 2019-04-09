import java.util.Scanner;

public class DriverCylinder {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Cylinder 1 Height: ");
		Cylinder a1 = new Cylinder(input.nextDouble());
		
		System.out.print("Enter Cylinder 2 Height:" );
		double d = input.nextDouble();
		System.out.print("Enter Cylinder 2 Radius:" );
		Cylinder a2 = new Cylinder(d,input.nextDouble());
		
		Cylinder a3 = new Cylinder();
		
		a1.displayInfo();
		a2.displayInfo();
		a3.displayInfo();
	}	
	
	
}