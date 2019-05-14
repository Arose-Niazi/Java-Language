import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReplaceForm extends JFrame{
	
	private final JTextField text[] = new JTextField[2];
	private final JButton replaceButton;
	
	public ReplaceForm(String title)
	{
		super(title);
		
		text[0] = new JTextField(10);
		text[1] = new JTextField(10);
		
		replaceButton = new JButton("Replace");
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,500);
	
		for(JTextField x: text) add(x);
		
		add(replaceButton);
		
		EventsHandler handler = new EventsHandler();
		replaceButton.addActionListener(handler);
	}
	private class EventsHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String s = text[0].getText();
			text[0].setText(text[1].getText());
			text[1].setText(s);
		}
	}
	
}