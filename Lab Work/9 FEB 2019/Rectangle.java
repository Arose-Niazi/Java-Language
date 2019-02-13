import java.lang.Math;


public class Rectangle
{
	private double length;
	private double width;
	
	public void setLength(double length)
	{
		this.length = length;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getArea()
	{
		return (width * length);
	}
	
	public double getPerimeter()
	{
		return ( 2 * (length + width ));
	}
	
	public void Display()
	{
		System.out.println("Displaying info of the Rectangle:\n" +
							"\t" + "Length: " + getLength() + "\n" +
							"\t" + "Width: " + getWidth() + "\n" +
							"\t" + "Perimeter: " + getPerimeter() + "\n" +
							"\t" + "Area: " + getArea()
		);
	}
}