import java.util.ArrayList;
class StudentTest
{
	public static void main(String args[])
	{
		ArrayList<Student> alist = new ArrayList<Student>();
		
		ArrayList<String> courses = new ArrayList<String>();
		ArrayList<Double> quizmarks = new ArrayList<Double>();
		
		courses.add("DLD");
		courses.add("DS");
		courses.add("CALCULUS");
		courses.add("OOP");
		courses.add("ISL");
		
		quizmarks.add(8.0);
		quizmarks.add(9.0);
		quizmarks.add(9.0);
		quizmarks.add(10.0);
		quizmarks.add(10.0);
		
		alist.add(new Student());
		alist.add(new Student("Mufti",courses,quizmarks));
		for(Student i: alist)
		{
			i.printinfo();
			System.out.println("\n");
		}
	}
}