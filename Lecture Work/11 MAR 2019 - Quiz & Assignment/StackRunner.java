import java.util.Scanner;
import java.util.EmptyStackException;

public class StackRunner
{
	
	public static void main(String args[])
	{
		Stack s = new Stack();
		Menu(s);
	}	
	
	public static void Menu(Stack s)
	{
		System.out.println("\n\nPlease select an option:");
		System.out.println("1 - Add Element.");
		System.out.println("2 - Remove Element.");
		System.out.println("3 - Display All.");
		System.out.println("4 - Quick add Elements.");
		System.out.println("5 - Exit.");
		
		System.out.print("Your selection: ");
		Scanner input = new Scanner(System.in);
		switch(input.nextInt())
		{
			case 1:
				System.out.print("Enter integer to add: ");
				try
				{
					s.push(input.nextInt());
				}
				catch (Exception e)
				{
					System.out.println("Invalid Input!");
				}
				break;
			case 2:
				try
				{
					System.out.println(s.pop());
				}
				catch(EmptyStackException e)
				{
					System.out.println("The Stack is empty!");
				}
				break;
			case 3:
				System.out.println("Stack: " + s);
				break;
			case 4:
				for(; ; )
				{
					System.out.print("Enter integer to add (-111001 to exit): ");
					int push = input.nextInt();
					if(push  == -111001) break;
					try
					{
						s.push(push);
					}
					catch (Exception e)
					{
						System.out.println("Invalid Input!");
					}
				}
				break;	
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid Option\n");
		}
		Menu(s);
	}
}