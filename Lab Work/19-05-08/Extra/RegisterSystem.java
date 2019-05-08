import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterSystem extends JFrame{
	
	private final JTextField username;
	private final JPasswordField password;
	
	private final JLabel usernameLabel;
	private final JLabel passwordLabel;
	
	private final MySQLConnection connection;
	private final Driver d;
	
	public RegisterSystem(String text,MySQLConnection connection,Driver d)
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
			if(!connection.checkUser(username.getText().trim()))
			{
				String pass= new String(password.getPassword());
				if(pass.length() != 0)
				{
					JOptionPane.showMessageDialog(null,"Account Registered!","Congrats!",JOptionPane.INFORMATION_MESSAGE);
					connection.addUser(username.getText().trim(),pass);
					return;
				}
				JOptionPane.showMessageDialog(null,"Please enter a password","Try Again",JOptionPane.ERROR_MESSAGE);
				return;
			}
			JOptionPane.showMessageDialog(null,"Username already extist","Try Again",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	
}