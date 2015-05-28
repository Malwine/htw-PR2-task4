package ss2015_aufgabe4;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Malwine
 *
 */
public class Calculator extends JFrame implements ActionListener {

	JPanel buttonPanel;
	JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
	JLabel textLabel;
	
	Calculator() {
		super();
		this.setTitle("Handle action");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textLabel = new JLabel("Text");
		textLabel.setHorizontalAlignment(JLabel.CENTER);
		textLabel.setFont(new Font("Verdana", Font.BOLD, 24));
		this.add(textLabel, BorderLayout.NORTH);	     //add label to content pane
		
		buttonPanel = initButtonPanel();
		this.add(buttonPanel, BorderLayout.SOUTH);
		
		this.setSize(800,350);
		this.setVisible(true);
	}
	
	private JPanel initButtonPanel(){
		JPanel panel = new JPanel();
		
		num1 = new JButton("1");
		num2 = new JButton("2");
		num3 = new JButton("3");
		num4 = new JButton("4");
		num5 = new JButton("5");
		num6 = new JButton("6");
		num7 = new JButton("7");
		num8 = new JButton("8");
		num9 = new JButton("9");
		num0 = new JButton("0");
		
		num1.addActionListener(this);
		num2.addActionListener(this);
		num3.addActionListener(this);
		num4.addActionListener(this);
		num5.addActionListener(this);
		num6.addActionListener(this);
		num7.addActionListener(this);
		num8.addActionListener(this);
		num9.addActionListener(this);
		num0.addActionListener(this);
		
		panel.add(num1);
		panel.add(num2);
		panel.add(num3);
		panel.add(num4);
		panel.add(num5);
		panel.add(num6);
		panel.add(num7);
		panel.add(num8);
		panel.add(num9);
		panel.add(num0);
		
		return panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(e.getActionCommand());
		Object clickSource = e.getSource();
		if (clickSource instanceof JButton){
			
			switch(e.getActionCommand()) {
			case "1": 
				this.textLabel.setText("1");
				break;
			case "2": 
				this.textLabel.setText("2");
				break;
			case "3": 
				this.textLabel.setText("3");
				break;
			case "4": 
				this.textLabel.setText("4");
				break;
			case "5": 
				this.textLabel.setText("5");
				break;
			case "6": 
				this.textLabel.setText("6");
				break;
			case "7": 
				this.textLabel.setText("7");
				break;
			case "8": 
				this.textLabel.setText("8");
				break;
			case "9": 
				this.textLabel.setText("9");
				break;
			case "0": 
				this.textLabel.setText("0");
				break;
			}
		} 
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

}
