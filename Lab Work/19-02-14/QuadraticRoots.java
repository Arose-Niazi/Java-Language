import java.lang.Math;

public class QuadraticRoots {
    private double a, b, c;
     
    public double getA()
    {
        return a;
    }
     
    public void setA(double a)
    {
        this.a = a;
    }
     
    public double getB()
    {
        return b;
    }
     
    public void setB(double b)
    {
        this.b = b;
    }
     
    public double getC()
    {
        return c;
    }
     
    public void setC(double c)
    {
        this.c = c;
    }
     
    public int checkRoots()
    {
		double root = (b * b) - (4 * a * c) ;
		if(root == 0) return 0;
		else if(root >  0) return 1;
		else return 2;
    }
	
	public double computeRoots(Boolean positive)
    {
		return ((((Math.sqrt((b * b) - (4 * a * c))) * ((positive)? 1:-1)) -b) / (2*a));
    }
     
    public void displayRoots()
    {
        switch(checkRoots())
		{
			case 0:
				System.out.println("Displaying info of the quadratic equation:\n" +
								"\t" + "A: " + a + "\n" +
								"\t" + "B: " + b + "\n" +
								"\t" + "C: " + c + "\n" +
								"\t" + "Roots: " + computeRoots(true) + "\n"
				);
				break;
			case 1:
				System.out.println("Displaying info of the quadratic equation:\n" +
								"\t" + "A: " + a + "\n" +
								"\t" + "B: " + b + "\n" +
								"\t" + "C: " + c + "\n" +
								"\t" + "Roots: " + computeRoots(true) + ", " + computeRoots(false) + "\n"
				);
				break;
			case 2:
				System.out.println("Displaying info of the quadratic equation:\n" +
                            "\t" + "A: " + a + "\n" +
                            "\t" + "B: " + b + "\n" +
                            "\t" + "C: " + c + "\n" +
                            "\t" + "Roots: Can not be determined." + "\n"
				);
		}
    }
     
}