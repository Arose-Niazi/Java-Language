public class Driver {
    public static void main(String args[])
    {
        Account a = new Account();
		Account b = new Account(500.0,"Qasim Hayat");
		Account c = new Account(b);
		a.displayAccount();
		b.displayAccount();
		c.displayAccount();
		
		a.setAccount("Fuad Mufti", 100.0);
		c.setAccount();
		a.displayAccount();
		b.displayAccount();
		c.displayAccount();
    }   
}