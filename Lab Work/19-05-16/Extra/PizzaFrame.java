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
	
	private final JComboBox<Integer> oQuantityCombo;
	private final JComboBox<Integer> cQuantityCombo;
	private final JComboBox<Integer> mQuantityCombo;
	
	private static final Integer[] toppingSize = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
	
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
		
		gbc.gridx++;
		add(sRadioButton,gbc);
		gbc.gridx++;
		add(mRadioButton,gbc);
		gbc.gridx++;
		add(lRadioButton,gbc);
		
		gbc.gridy = 1;
		gbc.gridx = 0;
		add(new JLabel("Toppings"),gbc);
		
		oCheckBox = new JCheckBox("Olive");
		cCheckBox = new JCheckBox("Extra Cheese");
		mCheckBox = new JCheckBox("Mushroom");
		
		gbc.gridx++;
		add(oCheckBox,gbc);
		gbc.gridx++;
		add(cCheckBox,gbc);
		gbc.gridx++;
		add(mCheckBox,gbc);
		
		gbc.gridy = 2;
		gbc.gridx = 1;
		oQuantityCombo = new JComboBox<Integer>(toppingSize);
		cQuantityCombo = new JComboBox<Integer>(toppingSize);
		mQuantityCombo = new JComboBox<Integer>(toppingSize);
		
		cQuantityCombo.setMaximumRowCount(3);
		cQuantityCombo.setMaximumRowCount(3);
		cQuantityCombo.setMaximumRowCount(3);
		
		add(oQuantityCombo,gbc);
		gbc.gridx++;
		add(cQuantityCombo,gbc);
		gbc.gridx++;
		add(mQuantityCombo,gbc);
		
		gbc.gridy = 3;
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
		
		oQuantityCombo.addItemListener(handler);
		cQuantityCombo.addItemListener(handler);
		mQuantityCombo.addItemListener(handler);
		
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
				price+=50*(oQuantityCombo.getSelectedIndex()+1);
			}
			if(cCheckBox.isSelected())
			{
				price+=100*(cQuantityCombo.getSelectedIndex()+1);
			}
			if(mCheckBox.isSelected())
			{
				price+=150*(mQuantityCombo.getSelectedIndex()+1);
			}
			priceLabel.setText(String.format("Price: Rs.%d",price));
		}
	}
	
}