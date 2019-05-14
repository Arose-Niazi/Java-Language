import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextStyleFrame extends JFrame{
	
	private final JTextField text;
	private final JCheckBox boldCheckBox;
	private final JCheckBox italicCheckBox;
	
	public TextStyleFrame(String title)
	{
		super(title);
		
		text = new JTextField(20);
		text.setText("HELLO");
		text.setFont(new Font("Ariel",Font.PLAIN,14));
		boldCheckBox = new JCheckBox("Bold");
		italicCheckBox = new JCheckBox("Italic");
		
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,500);
	
		add(text);
		add(boldCheckBox,false);
		add(italicCheckBox,false);
		
		EventsHandler handler = new EventsHandler();
		boldCheckBox.addItemListener(handler);
		italicCheckBox.addItemListener(handler);
	}
	private class EventsHandler implements ItemListener
	{
		@Override
		public void itemStateChanged(ItemEvent e)
		{
			if(boldCheckBox.isSelected() && italicCheckBox.isSelected())
			{
				text.setFont(new Font("Ariel",Font.BOLD + Font.ITALIC,14));
			}
			else if(boldCheckBox.isSelected())
			{
				text.setFont(new Font("Ariel",Font.BOLD,14));
			}
			else if(italicCheckBox.isSelected())
			{
				text.setFont(new Font("Ariel",Font.ITALIC,14));
			}
			else
			{
				text.setFont(new Font("Ariel",Font.PLAIN,14));
			}
				
		}
	}
	
}