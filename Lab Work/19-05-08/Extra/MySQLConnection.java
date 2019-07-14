import java.sql.*;  

public class MySQLConnection {

	private Connection con;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException ex) {
			System.out.println("Unable to load MySQL Driver");
		}
	}
	
	public MySQLConnection()
	{
		try {	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","");
		}
		catch(Exception e){ System.out.println(e);} 
	}
	
	public void endConnection()
	{
		try {	
			con.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	
	public boolean checkUser(String username)
	{
		try {	
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("SELECT username FROM Accounts WHERE username='"+username+"'"); 
			if(rs.next())  
				return true;
			else return false;
		}
		catch(SQLException e)
		{
			System.out.println(e);
			return false;
		}
	}
	
	public boolean getUser(String username, String password)
	{
		try {
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("SELECT username FROM Accounts WHERE username='"+username+"' AND password='"+password+"'"); 
			if(rs.next())  
				return true;
			else return false;
		}
		catch(SQLException e)
		{
			System.out.println(e);
			return false;
		}
	}
	
	public boolean addUser(String username, String password)
	{
		try {
			Statement stmt=con.createStatement();  
			int countUpdated=stmt.executeUpdate("INSERT INTO Accounts (username,password) VALUES ('"+username+"','"+password+"')"); 
			if(countUpdated > 0)  
				return true;
			else return false;
		}
		catch(SQLException e)
		{
			System.out.println(e);
			return false;
		}
	}

}