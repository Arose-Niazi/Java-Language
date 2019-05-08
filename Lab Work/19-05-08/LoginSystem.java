import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginSystem extends JFrame{
	
	private final JTextField username;
	private final JPasswordField password;
	
	private final JLabel usernameLabel;
	private final JLabel passwordLabel;
	
	public LoginSystem(String text)
	{
		super(text);
		
		username = new JTextField(10);
		password = new JPasswordField(10);
		
		usernameLabel = new JLabel("Username: ");
		passwordLabel = new JLabel("Password: ");
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,500);
	
		
		add(usernameLabel);
		add(username);
		
		add(passwordLabel);
		add(password);
		
		EventsHandler handler = new EventsHandler();
		username.addActionListener(handler);
		password.addActionListener(handler);
		
		
		
	}
	private class EventsHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(username.getText().equals("Arose Niazi"))
			{
				String pass = new String(password.getPassword());
				if(pass.equals("1234"))
				{
					JOptionPane.showMessageDialog(null,"Correct Password and Username!");
					return;
				}
				JOptionPane.showMessageDialog(null,"Incorrect Password!");
				return;
			}
			JOptionPane.showMessageDialog(null,"Incorrect Username!");
		}
	}
	
}