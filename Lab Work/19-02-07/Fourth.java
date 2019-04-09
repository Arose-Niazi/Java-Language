public class Fourth {
	public static void main(String args[])
	{
		System.out.println("");
		Double money = (Double) 1000.0;
		Double profit = (Double) 0.05;
		for(int i=0; i<=9; i++)
		{
			System.out.printf("Year - %d\tMoney - %.3f\tProfit - %.1f\tAfter Profit - %.3f\n",i+1,money,profit*100.0,money+=profit*money);
		}
	}
}