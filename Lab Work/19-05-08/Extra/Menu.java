import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame{
	
	private final JButton registerButton;
	private final JButton loginButton;
	private final Driver d;
	
	public Menu(Driver d)
	{
		super("Menu");
		
		this.d=d;
		
		registerButton = new JButton("Register");
		loginButton = new JButton("Login");
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,500);
	
		
		add(registerButton);
		add(loginButton);
		
		EventsHandler handler = new EventsHandler();
		registerButton.addActionListener(handler);
		loginButton.addActionListener(handler);
		
		addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                d.endProgram();
				System.exit(0);
            }
        });
		
	}
	private class EventsHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == registerButton)
			{
				d.registerSystem();
			}
			else 
			{
				d.loginSystem();
			}
		}
	}
	
}