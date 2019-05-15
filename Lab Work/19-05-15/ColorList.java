import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ColorList extends JFrame{
	
	private final JList<String> jColorList;
	private static final String colorsName[] = {"Green","Blue","Red","Black","White"};
	private static final Color[] colors = {Color.GREEN,Color.BLUE,Color.RED,Color.BLACK,Color.WHITE};
	
	public ColorList(String title)
	{
		super(title);
		
		jColorList = new JList<String>(colorsName);
		add(jColorList);
		add(new JScrollPane(jColorList));
		
		jColorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jColorList.setVisibleRowCount(2);
		
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,500);
	
		jColorList.addListSelectionListener(new ListSelectionListener(){
			
			@Override
			public void valueChanged(ListSelectionEvent e)
			{
				getContentPane().setBackground(colors[jColorList.getSelectedIndex()]);
			}
		});
	}
}