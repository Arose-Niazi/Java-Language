public class Box {
	private double length, width, height;
	
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
	
	public double Volume()
	{
		return (length * width * height);
	}
	
	public void Display()
	{
		System.out.println("Displaying info of the box:\n" +
							"\t" + "Length: " + length + "\n" +
							"\t" + "Width: " + width + "\n" +
							"\t" + "Height: " + height + "\n" +
							"\t" + "Volume: " + Volume() + "\n"
		);
	}
	
}