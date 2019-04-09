import java.lang.Math;

public class Cylinder
{
	private double radius;
	private double height;
	
	public Cylinder()
	{

	}
	
	
	public Cylinder(double height)
	{
		setHeight(height);
		setRadius(1);
	}
	
	public Cylinder(double height,double radius)
	{
		setHeight(height);
		setRadius(radius);
	}
	
	
	
	public void displayInfo()
	{
		System.out.println("Displaying info of the cylinder:\n" +
							"\t" + "Radius: " + getRadius() + "\n" +
							"\t" + "Height: " + getHeight() + "\n" +
							"\t" + "Area: " + computeArea() + "\n" +
							"\t" + "Volume: " + computeVolume() + "\n"
		);
	}
	
	public double computeArea()
	{
		return (Math.PI*radius*radius);
	}
	
	public double computeVolume()
	{
		return (Math.PI*radius*radius*height);
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
}