package mobOrganiser;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class MainWindow extends JFrame 
{
	
	private ContentPanel contentPanel;
	private JPanel mainPanel;
	private MenuBarPanel menuBar;

	public MainWindow()
	{	
		initialiseComponents();
	}
	
	public void initialiseComponents()
	{	
		menuBar = new MenuBarPanel(this);
		
		//makes the default screen when you enter the app the thought of the day
		contentPanel = new ThoughtOfTheDayPanel();
		
		//initialises the main panel, the opaque container that jframes require
		mainPanel = new JPanel(); 
		
		//this is the size of the whole app
		mainPanel.setPreferredSize(new Dimension(200,280));
		
		
		//adds menu bar and content panel
		mainPanel.add(menuBar);
		mainPanel.add(contentPanel);
		add(mainPanel);
		
		
		//layout stuff
		layoutComponents();
	}
	
	public void setMainFrameVisible(MainWindow window)
	{
		window.setTitle("Agenda");
		window.pack();
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	public void layoutComponents(){
		SpringLayout layout = new SpringLayout();
		mainPanel.setLayout(layout);
		layout.putConstraint(SpringLayout.NORTH, menuBar, 0, SpringLayout.NORTH, mainPanel);
		layout.putConstraint(SpringLayout.NORTH, contentPanel, 0, SpringLayout.SOUTH, menuBar);
		setResizable(false);
	}
	
	public void setContentPanel(ContentPanel newContentPanel) {
		mainPanel.remove(contentPanel);
		contentPanel = newContentPanel;
		mainPanel.add(contentPanel);
		layoutComponents();
		mainPanel.invalidate();
		mainPanel.validate();
	}
	
	public static void main(String[] args){
		MainWindow window = new MainWindow();
		window.setMainFrameVisible(window);
	}
}
