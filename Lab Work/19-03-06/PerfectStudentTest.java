import java.util.ArrayList;
class PerfectStudentTest
{
	public static void main(String args[])
	{
		ArrayList<PerfectStudent> alist = new ArrayList<PerfectStudent>();
		
		ArrayList<String> courses = new ArrayList<String>();
		ArrayList<Double> quizmarks = new ArrayList<Double>();
		ArrayList<Double> assignmentmarks = new ArrayList<Double>();
		
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
		
		assignmentmarks.add(7.0);
		assignmentmarks.add(5.0);
		assignmentmarks.add(5.0);
		assignmentmarks.add(8.0);
		assignmentmarks.add(0.0);
		
		alist.add(new PerfectStudent());
		alist.add(new PerfectStudent("Mufti",courses,quizmarks,assignmentmarks));

		alist.get(1).registerCourse("C++");
		alist.get(1).registerCourse("C#");
		alist.get(1).dropCourse("OOP");
		
		for(PerfectStudent i: alist)
		{
			i.printinfo();
			System.out.println("Passed Quizzes: "+i.getTotalPassedQuizzes());
			System.out.println("\n");
		}
	}
}