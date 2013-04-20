package mobOrganiser;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class MenuBarPanel extends JPanel {
	
	private JButton calendarButton;
	private JButton todayButton;
	private JButton contactsButton;
	
	public MenuBarPanel()
	{
		calendarButton = new JButton("C");
		todayButton = new JButton("T");
		contactsButton = new JButton("C");
		intialiseComponents();
	}
	
	public void intialiseComponents()
	{	
		SpringLayout layout = new SpringLayout();
		//setLayout(new GridLayout(1,3));
		setLayout(layout);
		
		setPreferredSize(new Dimension(200,35));
		
		add(calendarButton);
		add(todayButton);
		add(contactsButton);
		
		Dimension dimension1 = new Dimension(66, 35);
		Dimension dimension2 = new Dimension(68, 35);
		
		calendarButton.setPreferredSize(dimension1);
		todayButton.setPreferredSize(dimension2);
		contactsButton.setPreferredSize(dimension1);
		
		
		//align all 3 buttons with the top of this panel.
		layout.putConstraint(SpringLayout.NORTH, calendarButton, 0, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.NORTH, todayButton, 0, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.NORTH, contactsButton, 0, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, calendarButton, 0, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.WEST, todayButton, 0, SpringLayout.EAST, calendarButton);
		layout.putConstraint(SpringLayout.EAST, contactsButton, 0, SpringLayout.EAST, this);
	}
}
