import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class AsciiToBinaryParityOdd {
    public static void main(String[] args) throws UnsupportedEncodingException 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your name: ");
		byte[] infoBin = null;
		
		infoBin = (s.nextLine()).getBytes("UTF-8"); 
        
		for (byte b : infoBin) 
		{
            System.out.print("0"+Integer.toBinaryString(b) + "  ");
        }
		
		System.out.println("\nPrinting ODD parity");
		
		for (byte b : infoBin) 
		{
            System.out.print(((checkParity((char) b))? "0":"1")
							+ Integer.toBinaryString(b) 
							+ "  ");
		}
	}
	
	public static boolean checkParity(char myChar) 
	{
		int i;
		int parity = 0;

		while(myChar != 0)
		{    
			parity += (myChar&1);   
			myChar = (char)  (myChar>>1);     
		}
	  
		if(parity % 2 != 0){ 
			return true;
		}
		else 
		{ 
			return false;
		}
	}
}