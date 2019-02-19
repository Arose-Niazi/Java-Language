public class Box {
	private double length,width,height;
	
	public Box()
	{
		
	}
	
	public Box(double length,double width,double height)
	{
		this.length=length;
		this.width=width;
		this.height=height;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public void displayBox()
	{
		System.out.println("Displaying info of the box:\n" +
							"\t" + "Length: " + length + "\n" +
							"\t" + "Width: " + width + "\n" +
							"\t" + "Height: " + height + "\n"
		);
	}
}