import javax.swing.*;
import java.awt.*;

public class Driver {

	private MySQLConnection server;
	private Menu m;
	private RegisterSystem register;
	private LoginSystem login;

	public static void main(String args[])
	{
		new Driver();
	}
	
	public Driver()
	{
		server = new MySQLConnection();
		m = new Menu(this);
		register = new RegisterSystem("Register Field",server,this);
		login = new LoginSystem("Login Field",server,this);
		startProgram();
	}
	
	public void startProgram()
	{
		m.setVisible(true);
		register.setVisible(false);
		login.setVisible(false);
	}
	
	public void endProgram()
	{
		server.endConnection();
	}
	
	public void registerSystem()
	{
		m.setVisible(false);
		register.setVisible(true);
		login.setVisible(false);
	}
	
	public void loginSystem()
	{
		m.setVisible(false);
		register.setVisible(false);
		login.setVisible(true);
	}
}