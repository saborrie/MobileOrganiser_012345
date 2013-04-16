package mobOrganiser;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuBarPanel extends JPanel {
	
	private JButton calendarButton;
	private JButton todayButton;
	private JButton contactsButton;
	
	public MenuBarPanel()
	{
		calendarButton = new JButton("Calendar");
		todayButton = new JButton("Today");
		contactsButton = new JButton("Contacts");
		intialiseComponents();
	}
	
	public void intialiseComponents()
	{	
		setLayout(new GridLayout(1,3));
		
		setPreferredSize(new Dimension(200,35));
		
		add(calendarButton);
		add(todayButton);
		add(contactsButton);
	}
}
