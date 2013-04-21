package mobOrganiser;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;



public class ListViewPanel extends ContentPanel {
	
	JList<OrganiserEntry> list;
	DefaultListModel<OrganiserEntry> listModel;
	SpringLayout layout;
	private JScrollPane scrollPane;
	
	
	public ListViewPanel(){
		initialiseComponents();
		DataStore.readFile();
		insertList(DataStore.getContacts());
	}
	
	public ListViewPanel(Date date) {
		initialiseComponents();
	}
	
	private void insertList(ArrayList<OrganiserEntry> arrayList) {
		if(arrayList == null){
			System.out.println("NULL LIST");
			return;
		}
		
		for(OrganiserEntry oE : arrayList) {
			listModel.addElement(oE);
		}
	}

	
	
	private void initialiseComponents(){
		
		setBackground(Color.blue);
		
		list = new JList<OrganiserEntry>();
		listModel = new DefaultListModel<OrganiserEntry>();
		list.setModel(listModel);
		
		scrollPane = new JScrollPane(list);
		add(scrollPane);
		scrollPane.setPreferredSize(new Dimension(200,280-75));
	}
	
	private void layoutComponents(){
		setLayout(layout);
		layout.putConstraint(SpringLayout.NORTH, scrollPane, 0, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, scrollPane, 0, SpringLayout.WEST, this);
	}
	
}
