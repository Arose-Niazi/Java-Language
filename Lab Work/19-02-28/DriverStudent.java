import java.util.Scanner;

public class DriverStudent {
	public static void main(String args[])
	{
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter Name for Student 1: ");
		String h = input.nextLine();
		System.out.print("Enter marks for Student 1: ");
		float m = input.nextFloat();
		Student a = new Student(h,m);
		
		System.out.print("Enter passing marks: ");
		Student.updateStaticLimit(input.nextFloat());
		
		System.out.print("Enter Name for Student 2: ");
		input.nextLine();
		h = input.nextLine();
		System.out.print("Enter marks for Student 2: ");
		m = input.nextFloat();
		Student a1 = new Student(h,m);
		
		System.out.println("Student one " + ((a.isPassed())? "Passed" : "Failed"));
		
		System.out.println("Student two " + ((a1.isPassed())? "Passed" : "Failed"));
		
	}	
	
	
}