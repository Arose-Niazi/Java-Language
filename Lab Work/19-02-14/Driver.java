import java.util.Scanner;
 
public class Driver {
    public static void main(String args[])
    {
        Menu();
    }   
     
    public static void Menu()
    {
         
        System.out.println("\n\nPlease select an option:");
        System.out.println("1 - Quadratic Roots.");
        System.out.println("2 - End program.");
        System.out.print("Your selection: ");
        Scanner s = new Scanner(System.in);
        switch(s.nextInt())
        {
            case 1:
                QuadraticRoots qr = new QuadraticRoots();
                System.out.print("Enter A: ");
                qr.setA(s.nextDouble());
                System.out.print("Enter B: ");
                qr.setB(s.nextDouble());
				System.out.print("Enter C: ");
                qr.setC(s.nextDouble());
                System.out.println("");
                qr.displayRoots();
                Menu();
                break;
			case 2:	
                break;
            default:
                System.out.println("Invalid Option\n");
                Menu();
        }
    }
     
     
}