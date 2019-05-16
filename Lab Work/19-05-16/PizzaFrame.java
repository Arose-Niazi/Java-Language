import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PizzaFrame extends JFrame{
	
	private final JRadioButton sRadioButton;
	private final JRadioButton mRadioButton;
	private final JRadioButton lRadioButton;
	
	private final JCheckBox oCheckBox;
	private final JCheckBox cCheckBox;
	private final JCheckBox mCheckBox;
	
	private final JLabel priceLabel;
	
	public PizzaFrame(String title)
	{
		super(title);
		
		GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
		setLayout(layout);
		gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
		
		add(new JLabel("Select Pizza Size:"),gbc);
		sRadioButton = new JRadioButton("Small",false);
		mRadioButton = new JRadioButton("Medium",false);
		lRadioButton = new JRadioButton("Large",false);
		
		ButtonGroup b =new ButtonGroup();
		b.add(sRadioButton);
		b.add(mRadioButton);
		b.add(lRadioButton);
		
		gbc.gridx = 1;
		add(sRadioButton,gbc);
		gbc.gridx = 2;
		add(mRadioButton,gbc);
		gbc.gridx = 3;
		add(lRadioButton,gbc);
		
		gbc.gridy = 1;
		gbc.gridx = 0;
		add(new JLabel("Toppings"),gbc);
		
		oCheckBox = new JCheckBox("Olive");
		cCheckBox = new JCheckBox("Extra Cheese");
		mCheckBox = new JCheckBox("Mushroom");
		
		gbc.gridx = 1;
		add(oCheckBox,gbc);
		gbc.gridx = 2;
		add(cCheckBox,gbc);
		gbc.gridx = 3;
		add(mCheckBox,gbc);
		
		gbc.gridy = 2;
		gbc.gridx = 2;
		priceLabel = new JLabel("Price: Rs.0.0");
		add(priceLabel,gbc);
		
       
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,500);
		
		EventsHandler handler = new EventsHandler();
		sRadioButton.addItemListener(handler);
		mRadioButton.addItemListener(handler);
		lRadioButton.addItemListener(handler);
		
		oCheckBox.addItemListener(handler);
		cCheckBox.addItemListener(handler);
		mCheckBox.addItemListener(handler);
		
	}
	private class EventsHandler implements ItemListener
	{
		@Override
		public void itemStateChanged(ItemEvent e)
		{
			int price=0;
			if(sRadioButton.isSelected())
			{
				price+=500;
			}
			else if(mRadioButton.isSelected())
			{
				price+=750;
			}
			else if(lRadioButton.isSelected())
			{
				price+=950;
			}
			else
			{
				priceLabel.setText(String.format("Price: Rs.%d",price));
				return;
			}
			if(oCheckBox.isSelected())
			{
				price+=50;
			}
			if(cCheckBox.isSelected())
			{
				price+=100;
			}
			if(mCheckBox.isSelected())
			{
				price+=150;
			}
			priceLabel.setText(String.format("Price: Rs.%d",price));
		}
	}
	
}