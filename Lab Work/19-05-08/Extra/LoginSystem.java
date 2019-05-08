import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginSystem extends JFrame{
	
	private final JTextField username;
	private final JPasswordField password;
	
	private final JLabel usernameLabel;
	private final JLabel passwordLabel;
	
	private final MySQLConnection connection;
	private final Driver d;
	
	public LoginSystem(String text,MySQLConnection connection,Driver d)
	{
		super(text);
		this.connection=connection;
		this.d=d;
		
		username = new JTextField(10);
		password = new JPasswordField(10);
		
		usernameLabel = new JLabel("Username: ");
		passwordLabel = new JLabel("Password: ");
		
		setLayout(new FlowLayout());
		//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
		setSize(700,500);
	
		
		add(usernameLabel);
		add(username);
		
		add(passwordLabel);
		add(password);
		
		EventsHandler handler = new EventsHandler();
		username.addActionListener(handler);
		password.addActionListener(handler);
		
		addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                d.startProgram();
            }
        });
		
	}
	private class EventsHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(connection.checkUser(username.getText()))
			{
				if(connection.getUser(username.getText(),new String(password.getPassword())))
				{
					JOptionPane.showMessageDialog(null,"Correct Password and Username!","Welcome Back",JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				JOptionPane.showMessageDialog(null,"Incorrect Password!","Try Again",JOptionPane.ERROR_MESSAGE);
				return;
			}
			JOptionPane.showMessageDialog(null,"Incorrect Username!","Try Again",JOptionPane.ERROR_MESSAGE);
		}
	}
	
}