public class Student
{
	private String name;
	private float marks;
	private static float passLimit;
	
	
	public Student(String name,float marks)
	{
		this.name = name;
		this.marks = marks;
	}
	
	static 
	{
		passLimit = (float) 50.0;
	}
	
	public static void updateStaticLimit(float marks)
	{
		passLimit = marks;
	}
	
	public boolean isPassed()
	{
		if(marks >= passLimit) return true;
		return false;
	}
	
	
}