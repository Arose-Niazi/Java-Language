import java.lang.Math;
import java.util.Scanner;

public class Circle
{
	private double radius;
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return (Math.PI * (radius * radius));
	}
	
	public double getPerimeter()
	{
		return (2 * Math.PI * radius);
	}
	
	public void Display()
	{
		System.out.println("Displaying info of the circle:\n" +
							"\t" + "Radius: " + getRadius() + "\n" +
							"\t" + "Perimeter: " + getPerimeter() + "\n" +
							"\t" + "Area: " + getArea()
		);
	}
}