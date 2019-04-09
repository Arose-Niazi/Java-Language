public class Fraction
{
	private int numerator;
	private int denominator;
	
	public Fraction()
	{
		setNumerator(0);
		setDenominator(1);
	}
	
	public Fraction(int numerator,int denominator)
	{
		setNumerator(numerator);
		setDenominator(denominator);
	}
	
	public void printFraction()
	{	
		if(getDenominator() == 1)
			System.out.printf("Printing Fraction:\n\t"
							+ "%d\n",getNumerator());
		else
			System.out.printf("Printig Fraction:\n\t"
						+ " %d/%d\n",getNumerator(),getDenominator());
	}
	
	public void addNumber(int number)
	{
		setNumerator(getNumerator() + number*getDenominator());
	}
	
	public int getNumerator()
	{
		return numerator;
	}
	
	public void setNumerator(int numerator)
	{
		this.numerator = numerator;	
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	public void setDenominator(int denominator)
	{
		if(denominator == 0) this.denominator = 1;
		else this.denominator = denominator;
		if(getNumerator() < 0 && getDenominator() < 0) 
		{
			setNumerator(getNumerator() * -1);
			setDenominator(getDenominator() * -1);
		}
		else if(getDenominator() < 0)
		{
			setNumerator(getNumerator() * -1);
			setDenominator(getDenominator() * -1);
		}
	}
	
	public void simplifyFraction()
	{
		int gcd = GCD(getNumerator(),getDenominator());
		setNumerator(getNumerator() / gcd);
		setDenominator(getDenominator() / gcd);
	}
	
	private static int GCD(int numerator,int denominator)
	{
		if(denominator==0)
			return numerator;
		return GCD(denominator,numerator%denominator);
	}
	
}