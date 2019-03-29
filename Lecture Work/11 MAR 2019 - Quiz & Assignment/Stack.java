import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack
{
	private ArrayList<Integer> stack;
	
	public Stack()
	{
		stack = new ArrayList<Integer>();
	}
	
	public void push(int i)
	{
		stack.add(i);
	}
	
	public int pop()
	{
		if(!stack.isEmpty())
		{
			int a = stack.get(stack.size()-1);
			stack.remove(stack.size()-1);		
			return a;
		}
		else throw new EmptyStackException();
	}
	
	public String toString()
	{
		return stack.toString();
	}
}