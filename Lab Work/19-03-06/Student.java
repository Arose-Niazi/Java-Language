import java.util.ArrayList;
class Student
{
	private String name;
	private ArrayList<String> courses;
	private ArrayList<Double> quizMarks;
	
	public Student(String name,ArrayList<String> courses,ArrayList<Double> quizMarks)
	{
		setName(name);
		setCoruses(courses);
		setQuizMarks(quizMarks);
	}
	
	public Student()
	{
		
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setCoruses(ArrayList<String> courses)
	{
		this.courses = courses;
	}
	
	public void setQuizMarks(ArrayList<Double> quizMarks)
	{
		this.quizMarks = quizMarks;
	}
	
	public void printinfo()
	{
		System.out.println("Student: " + name);
		System.out.println("Subjects: " + courses);
		System.out.println("Quiz Marks: " + quizMarks);
	}
}