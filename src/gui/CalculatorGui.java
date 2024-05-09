package gui;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

import constants.CommonConstants;

public class CalculatorGui extends JFrame {
	private final SpringLayout springLayout = new SpringLayout();
	
	public CalculatorGui() {
		super(CommonConstants.APP_NAME);
		setSize(CommonConstants.APP_SIZE[0], CommonConstants.APP_SIZE[1]);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(springLayout);
		
		addGuiComponents();
	}
	
	public void addGuiComponents() {
		
	}

}
