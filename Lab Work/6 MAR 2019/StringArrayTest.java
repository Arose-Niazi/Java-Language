import java.util.ArrayList;
class StringArrayTest
{
	public static void main(String args[])
	{
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("ABC");
		alist.add("DEF");
		alist.add("GHI");
		alist.add("JKL");
		System.out.println(alist);
		alist.remove(1);
		alist.remove("GHI");
		System.out.println(alist);
	}
}