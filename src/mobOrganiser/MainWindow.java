package mobOrganiser;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class MainWindow extends JFrame 
{
	
	public MainWindow()
	{	
		initialiseComponents();
	}
	
	public void initialiseComponents()
	{
		MenuBarPanel menuBar = new MenuBarPanel();
		SpringLayout layout = new SpringLayout();
		
		JPanel mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(200,280));
		
		
		//adds
		mainPanel.add(menuBar, BorderLayout.NORTH);
		
		add(mainPanel);
		
		
		//layout stuff
		mainPanel.setLayout(layout);
		layout.putConstraint(SpringLayout.NORTH, menuBar, 0, SpringLayout.NORTH, mainPanel);
		
		setResizable(false);
	}
	
	public void setMainFrameVisible(MainWindow window)
	{
		window.setTitle("Agenda");
		window.pack();
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	public static void main(String[] args){
		MainWindow window = new MainWindow();
		window.setMainFrameVisible(window);
	}
}
