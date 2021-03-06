package mobOrganiser;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class MenuBarPanel extends JPanel {
	
	private JButton calendarButton;
	private JButton todayButton;
	private JButton contactsButton;
	private MainWindow window;
	
	public MenuBarPanel(MainWindow window)
	{
		this.window = window;
		calendarButton = new JButton(new ImageIcon("calendarButton.png"));
		todayButton = new JButton(new ImageIcon("todayButton.png"));
		contactsButton = new JButton(new ImageIcon("contactsButton.png"));
		intialiseComponents();
	}
	
	public void intialiseComponents()
	{	
		ActionListener actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(calendarButton)) {
					window.setContentPanel(new MonthViewPanel());
				}
				else if (e.getSource().equals(todayButton)) {
					window.setContentPanel(new ListViewPanel(new Date()));
				}
				else if (e.getSource() == contactsButton) {
					window.setContentPanel(new ListViewPanel());
				}
				
			}
		};
		
		
		SpringLayout layout = new SpringLayout();
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
		
		calendarButton.addActionListener(actionListener);
		todayButton.addActionListener(actionListener);
		contactsButton.addActionListener(actionListener);
		
		
		
		//align all 3 buttons with the top of this panel.
		layout.putConstraint(SpringLayout.NORTH, calendarButton, 0, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.NORTH, todayButton, 0, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.NORTH, contactsButton, 0, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, calendarButton, 0, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.WEST, todayButton, 0, SpringLayout.EAST, calendarButton);
		layout.putConstraint(SpringLayout.EAST, contactsButton, 0, SpringLayout.EAST, this);
	}
}
