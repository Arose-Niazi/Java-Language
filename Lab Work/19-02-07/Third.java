import java.util.Scanner;

public class Third {
	public static void main(String args[])
	{
		System.out.println("");
		Scanner s = new Scanner(System.in);
		int biggest = 0;
		Integer number[] = new Integer[5] ;
		for(int i=0; i<5; i++)
		{
			System.out.printf("Enter number %d: ",i+1);
			number[i] = s.nextInt();
			if(i == 0)
			{
				biggest = number[i];
			}
			else
			{
				if(biggest < number[i]) biggest = number[i];
			}
		}
		System.out.println("Biggest number: "+ biggest);
	}
}
