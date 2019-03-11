import java.util.ArrayList;

public class Billing 
{
	private int billID;
	private double docFee;
	private double testsFee;
	private Date billDate;
	ArrayList<Medicine> med;
	
	private static int totalNoBills;
	
	static 
	{
		totalNoBills=0;
	}
	
	public Billing(double docFee, double testsFee, Date billDate, ArrayList<Medicine> med)
	{
		this.docFee=docFee;
		this.testsFee=testsFee;
		this.billDate=billDate;
		this.med=med;
		totalNoBills++;
		billID=totalNoBills;
	}
	
	public String toString()
	{
		String a = "Bill ID: " + billID;
		a+= "\nDoc Fee: " + docFee;
		a+= "\nTests Fee: " + testsFee;
		a+= "\nDate: " + billDate;
		for(Medicine i: med)
		{
			a+="\n" + i;
		}
		a+= "\nTotal Bill: " + totalBillAmount();
		return a;
	}
	
	public double totalBillAmount()
	{
		double bill = 0.0;
		for(Medicine i: med)
		{
			bill+=i.getMedPrice();
		}
		bill+=docFee;
		bill+= testsFee;
		return bill;
	}
}