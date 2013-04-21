package mobOrganiser;

import java.awt.Dimension;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SpringLayout;



public class ListViewPanel extends ContentPanel {
	
	JList<OrganiserEntry> list;
	SpringLayout layout;
	
	
	public ListViewPanel(){
		initialiseComponents();
	}
	
	public ListViewPanel(Date date) {
		initialiseComponents();
	}
	
	private void initialiseComponents(){
		
		list = new JList<OrganiserEntry>();
		add(list);
		list.setPreferredSize(new Dimension(200,280-35-35));
	}
	
	private void layoutComponents(){
		setLayout(layout);
		layout.putConstraint(SpringLayout.NORTH, list, 0, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, list, 0, SpringLayout.WEST, this);
	}
	
}
