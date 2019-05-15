import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ColorsComboBox extends JFrame{
	
	private final JComboBox<String> colorsComboBox;
	private static final String colorsName[] = {"Green","Blue","Red","Black","White"};
	private static final Color[] colors = {Color.GREEN,Color.BLUE,Color.RED,Color.BLACK,Color.WHITE};
	
	public ColorsComboBox(String title)
	{
		super(title);
		
		colorsComboBox = new JComboBox<String>(colorsName);
		add(colorsComboBox);
		colorsComboBox.setMaximumRowCount(2);
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,500);
	
		colorsComboBox.addItemListener(new ItemListener(){
			
			@Override
			public void itemStateChanged(ItemEvent event)
			{
				if(event.getStateChange() == ItemEvent.SELECTED) getContentPane().setBackground(colors[colorsComboBox.getSelectedIndex()]);
			}
		});
	}
}