import java.util.ArrayList;
class IntegerArrayTest
{
	public static void main(String args[])
	{
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(55);
		alist.add(66);
		alist.add(77);
		alist.add(88);
		System.out.println(alist);
		alist.remove(1);
		System.out.println(alist);
	}
}