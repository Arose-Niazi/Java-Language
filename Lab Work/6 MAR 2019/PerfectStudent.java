import java.util.ArrayList;
import java.lang.Math;
class PerfectStudent
{
	private String name;
	private ArrayList<String> courses;
	private ArrayList<Double> quizMarks;
	private ArrayList<Integer> assignmentMarks;
	
	static Double passLimit;
	
	static
	{
		passLimit = new Double(5.0);
	}
	
	public PerfectStudent(String name,ArrayList<String> courses,ArrayList<Double> quizMarks,ArrayList<Double> assignmentMarks)
	{
		setName(name);
		setCoruses(courses);
		setQuizMarks(quizMarks);
		setAssignmentMarks(new ArrayList<Integer>());
		for(Double d: assignmentMarks)
		{
			this.assignmentMarks.add(d.intValue());
		}
	}
	
	public PerfectStudent()
	{
		setCoruses(new ArrayList<String>());
		setQuizMarks(new ArrayList<Double>());
		setAssignmentMarks(new ArrayList<Integer>());
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
	public void setAssignmentMarks(ArrayList<Integer> assignmentMarks)
	{
		this.assignmentMarks = assignmentMarks;
	}
	
	public void printinfo()
	{
		System.out.println("Student: " + name);
		System.out.println("Subjects: " + courses);
		System.out.println("Quiz Marks: " + quizMarks);
		System.out.println("Assignment Marks: " + assignmentMarks);
	}
	
	public int getTotalPassedQuizzes()
	{
		int counter=0;
		if(quizMarks.isEmpty()) return 0;
		for(Double i: quizMarks)
		{
			if(i >= passLimit) counter++;
		}
		return counter;
	}
	
	public void registerCourse(String course)
	{
		courses.add(course);
	}
	
	public void dropCourse(String course)
	{
		if(courses.contains(course))
			courses.remove(course);
	}
}