package ss2015_aufgabe4;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
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
	JButton plus, minus, divide, multiply, equals, openBracket, closingBracket, clear, dot,
	  num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
	JLabel textLabel;
	
	Calculator() {
		super();
		this.setTitle("Handle action");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textLabel = new JLabel("");
		textLabel.setHorizontalAlignment(JLabel.CENTER);
		textLabel.setFont(new Font("Verdana", Font.BOLD, 24));
		this.add(textLabel, BorderLayout.NORTH);	     //add label to content pane
		
		buttonPanel = initButtonPanel();
		buttonPanel.setLayout(new GridLayout(8,3));
		this.add(buttonPanel, BorderLayout.SOUTH);
		
		this.setSize(600,350);
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
		openBracket = new JButton("(");
		num0 = new JButton("0");
		closingBracket = new JButton(")");
		plus = new JButton("+");
		minus = new JButton("-");
		divide = new JButton("/");
		multiply = new JButton("*");
		dot = new JButton(".");
		equals = new JButton("=");
		clear = new JButton("C");
		
		num1.addActionListener(this);
		num2.addActionListener(this);
		num3.addActionListener(this);
		num4.addActionListener(this);
		num5.addActionListener(this);
		num6.addActionListener(this);
		num7.addActionListener(this);
		num8.addActionListener(this);
		num9.addActionListener(this);
		openBracket.addActionListener(this);
		num0.addActionListener(this);
		closingBracket.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		divide.addActionListener(this);
		multiply.addActionListener(this);
		dot.addActionListener(this);
		equals.addActionListener(this);
		clear.addActionListener(this);
		
		panel.add(num1);
		panel.add(num2);
		panel.add(num3);
		panel.add(num4);
		panel.add(num5);
		panel.add(num6);
		panel.add(num7);
		panel.add(num8);
		panel.add(num9);
		panel.add(openBracket);
		panel.add(num0);
		panel.add(closingBracket);
		panel.add(plus);
		panel.add(minus);
		panel.add(divide);
		panel.add(multiply);
		panel.add(dot);
		panel.add(equals);
		panel.add(clear);
		
		return panel;
	}
	
	void changeLabel(String input){
		
		String content = this.textLabel.getText();
		
		if (content == null) {
			this.textLabel.setText(input);
		}
		else {
			this.textLabel.setText(content + input);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(e.getActionCommand());
		Object clickSource = e.getSource();
		if (clickSource instanceof JButton){
			
			switch(e.getActionCommand()) {
			case "1": 
				changeLabel("1");
				break;
			case "2": 
				changeLabel("2");
				break;
			case "3": 
				changeLabel("3");
				break;
			case "4": 
				changeLabel("4");
				break;
			case "5": 
				changeLabel("5");
				break;
			case "6": 
				changeLabel("6");
				break;
			case "7": 
				changeLabel("7");
				break;
			case "8": 
				changeLabel("8");
				break;
			case "9": 
				changeLabel("9");
				break;
			case "0": 
				changeLabel("0");
				break;
			case "C": 
				this.textLabel.setText("");
				break;
			}
		} 
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

}
