import java.util.Scanner;

public class DriverFraction {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numerator for Fraction 1: ");
		int h = input.nextInt();
		System.out.print("Enter denominator for Fraction 1: ");
		int m = input.nextInt();
		Fraction a = new Fraction(h,m);
		
		Fraction a1 = new Fraction();
		
		System.out.print("Enter number to add in Fraction 1: ");
		a.addNumber(input.nextInt());
		
		System.out.print("Enter number to add in Fraction 2: ");
		a1.addNumber(input.nextInt());
		
		a.simplifyFraction();
		a1.simplifyFraction();
		
		a.printFraction();
		a1.printFraction();
		
	}	
	
	
}