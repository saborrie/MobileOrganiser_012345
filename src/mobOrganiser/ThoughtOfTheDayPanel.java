package mobOrganiser;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

public class ThoughtOfTheDayPanel extends ContentPanel {
	
	private JButton swapButton;
	private JLabel thoughtOfTheDay;
	private SpringLayout layout;
	private String labelText;
	
	public ThoughtOfTheDayPanel() {
		intialiseComponents();
	}
	
	public void intialiseComponents(){
		swapButton = new JButton("Swap");
		setUpTextFormat();
		thoughtOfTheDay = new JLabel(labelText);
		
		swapButton.setPreferredSize(new Dimension(200,35));
		thoughtOfTheDay.setPreferredSize(new Dimension(200,280-35-35));
		
		add(thoughtOfTheDay);
		add(swapButton);
		
		layoutComponents();
	}
	
	public void setUpTextFormat(){
		//Sets text to wrap for width of label
		labelText = "If our house be on fire, without inquiring whether it was fired from within or without, we must try to extinguish it. -Thomas Jefferson.";
		labelText = String.format("<html><div WIDTH=%d>%s</div><html>", 200, labelText);
	}
	
	public void layoutComponents(){
		layout = new SpringLayout();
		this.setLayout(layout);
		layout.putConstraint(SpringLayout.SOUTH, swapButton, 0, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.NORTH, thoughtOfTheDay, 0, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, thoughtOfTheDay, 5, SpringLayout.HORIZONTAL_CENTER, this);
	}
	
	public void getNextThought(){
		
	}
	
	public void setThought(String thought){
		thoughtOfTheDay.setText(thought);
	}
}
