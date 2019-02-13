public class Box {
	double length, width, height;
	
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