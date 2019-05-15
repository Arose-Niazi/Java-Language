import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonTextStyle extends JFrame{
	
	private final JTextField text;
	private final JRadioButton boldRadioButton;
	private final JRadioButton italicRadioButton;
	private final JRadioButton boldItalicRadioButton;
	private final JRadioButton plainRadioButton;
	
	public RadioButtonTextStyle(String title)
	{
		super(title);
		
		text = new JTextField(20);
		text.setText("Enter Text");
		text.setFont(new Font("Ariel",Font.PLAIN,14));
		boldRadioButton = new JRadioButton("Bold",false);
		italicRadioButton = new JRadioButton("Italic",false);
		boldItalicRadioButton = new JRadioButton("Bold Italic",false);
		plainRadioButton = new JRadioButton("Plain",true);
		
		ButtonGroup b =new ButtonGroup();
		b.add(boldRadioButton);
		b.add(italicRadioButton);
		b.add(boldItalicRadioButton);
		b.add(plainRadioButton);
		
		add(text);
		add(boldRadioButton);
		add(italicRadioButton);
		add(boldItalicRadioButton);
		add(plainRadioButton);
		
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,500);
		
		boldRadioButton.addItemListener(new EventsHandler(new Font("Ariel",Font.BOLD,14)));
		italicRadioButton.addItemListener(new EventsHandler(new Font("Ariel",Font.ITALIC,14)));
		boldItalicRadioButton.addItemListener(new EventsHandler(new Font("Ariel",Font.BOLD + Font.ITALIC,14)));
		plainRadioButton.addItemListener(new EventsHandler(new Font("Ariel",Font.PLAIN,14)));
	}
	private class EventsHandler implements ItemListener
	{
		Font f;
		public EventsHandler(Font f)
		{
			this.f = f;
		}
		@Override
		public void itemStateChanged(ItemEvent e)
		{
			text.setFont(f);
		}
	}
	
}