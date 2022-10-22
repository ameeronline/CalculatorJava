import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	Boolean isOperatorClicked=false;
	String oldVal;
	String newVal;
	float sum;
	
	
	JFrame frame;
	JLabel displayLabel;
	
	JButton clearButton;
	JButton addorminButton;
	JButton modulusButton;
	JButton divisionButton;
	
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton multiplicationButton;
	
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton subtractionButton;
	
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton additionButton;
	
	JButton zeroButton;
	JButton dotButton;
	JButton equalsButton;
	
	
	public Calculator() {
		frame=new JFrame();
		frame.setLayout(null);
		frame.setSize(400,600);
		frame.setLocation(700, 80);
		
		//Design and implementation of Display
		
		displayLabel=new JLabel("");
		displayLabel.setBounds(20,40,340,40);
		displayLabel.setBackground(Color.DARK_GRAY);
		displayLabel.setForeground(Color.WHITE);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.add(displayLabel);
		
		//Initial Buttons
		
		clearButton=new JButton("AC");
		clearButton.setBounds(20, 100, 70, 70);
		clearButton.setForeground(Color.red);
		frame.add(clearButton);
		clearButton.addActionListener(this);
		
		addorminButton=new JButton("+/-");
		addorminButton.setBounds(110, 100, 70, 70);
		addorminButton.setForeground(Color.red);
		frame.add(addorminButton);
		addorminButton.addActionListener(this);
		
		modulusButton=new JButton("%");
		modulusButton.setBounds(200, 100, 70, 70);
		modulusButton.setForeground(Color.red);
		frame.add(modulusButton);
		modulusButton.addActionListener(this);
		
		divisionButton=new JButton("/");
	    divisionButton.setBounds(290, 100, 70, 70);
		divisionButton.setForeground(Color.red);
		frame.add(divisionButton);
		divisionButton.addActionListener(this);
		
		//First row of buttons
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(20, 190, 70, 70);
		sevenButton.setForeground(Color.red);
		frame.add(sevenButton);
		sevenButton.addActionListener(this);
		
		eightButton=new JButton("8");
		eightButton.setBounds(110, 190, 70, 70);
		eightButton.setForeground(Color.red);
		frame.add(eightButton);
		eightButton.addActionListener(this);
		
		nineButton=new JButton("9");
		nineButton.setBounds(200, 190, 70, 70);
		nineButton.setForeground(Color.red);
		frame.add(nineButton);
		nineButton.addActionListener(this);
		
		multiplicationButton=new JButton("*");
	    multiplicationButton.setBounds(290, 190, 70, 70);
		multiplicationButton.setForeground(Color.red);
		frame.add(multiplicationButton);
		multiplicationButton.addActionListener(this);
		
		//Second row of buttons
		
		fourButton=new JButton("4");
		fourButton.setBounds(20, 280, 70, 70);
		fourButton.setForeground(Color.red);
		frame.add(fourButton);
		fourButton.addActionListener(this);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(110, 280, 70, 70);
		fiveButton.setForeground(Color.red);
		frame.add(fiveButton);
		fiveButton.addActionListener(this);
		
		sixButton=new JButton("6");
		sixButton.setBounds(200, 280, 70, 70);
		sixButton.setForeground(Color.red);
		frame.add(sixButton);
		sixButton.addActionListener(this);
		
		subtractionButton=new JButton("-");
	    subtractionButton.setBounds(290, 280, 70, 70);
		subtractionButton.setForeground(Color.red);
		frame.add(subtractionButton);
		subtractionButton.addActionListener(this);
		
		//Third row of buttons
		
		oneButton=new JButton("1");
		oneButton.setBounds(20, 370, 70, 70);
		oneButton.setForeground(Color.red);
		frame.add(oneButton);
		oneButton.addActionListener(this);
		
		twoButton=new JButton("2");
		twoButton.setBounds(110, 370, 70, 70);
		twoButton.setForeground(Color.red);
		frame.add(twoButton);
		twoButton.addActionListener(this);
		
		threeButton=new JButton("3");
		threeButton.setBounds(200, 370, 70, 70);
		threeButton.setForeground(Color.red);
		frame.add(threeButton);
		threeButton.addActionListener(this);
		
		additionButton=new JButton("+");
	    additionButton.setBounds(290, 370, 70, 70);
		additionButton.setForeground(Color.red);
		frame.add(additionButton);
		additionButton.addActionListener(this);
		
		//Fourth row of buttons
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(20, 460, 160, 70);
		zeroButton.setForeground(Color.red);
		frame.add(zeroButton);
		zeroButton.addActionListener(this);
		
		dotButton=new JButton(".");
		dotButton.setBounds(200, 460, 70, 70);
		dotButton.setForeground(Color.red);
		frame.add(dotButton);
		dotButton.addActionListener(this);
		
		equalsButton=new JButton("=");
		equalsButton.setBounds(290, 460, 70, 70);
		equalsButton.setForeground(Color.red);
		frame.add(equalsButton);
		equalsButton.addActionListener(this);
		
		
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		Calculator sc=new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"0");
			}
			
		}
	    else if(e.getSource()==oneButton) {
	    	if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"1");
			}
		}
		else if(e.getSource()==twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"2");
			}
		}
		else if(e.getSource()==threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"3");
			}
		}
		else if(e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"4");
			}
		}
		else if(e.getSource()==fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"5");
			}
		}
		else if(e.getSource()==sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"6");
			}
		}
		else if(e.getSource()==sevenButton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"7");
			}
		}
		else if(e.getSource()==eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"8");
			}
		}
		else if(e.getSource()==nineButton) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"9");
			}
		}
		else if(e.getSource()==clearButton) {
			displayLabel.setText("");
		}
		else if(e.getSource()==addorminButton) {
			displayLabel.setText("");
		}
		else if(e.getSource()==modulusButton) {
			displayLabel.setText("");
		}
		else if(e.getSource()==divisionButton) {
			displayLabel.setText("");
		}
		else if(e.getSource()==multiplicationButton) {
			displayLabel.setText("");
		}
		else if(e.getSource()==subtractionButton) {
			displayLabel.setText("");
		}
		else if(e.getSource()==additionButton) {
			isOperatorClicked=true;
			oldVal=displayLabel.getText();
		}
		else if(e.getSource()==equalsButton) {
			
			newVal=displayLabel.getText();
			
			float oldValF=Float.parseFloat(oldVal);
			float newValF=Float.parseFloat(newVal);
			sum=oldValF+newValF;
			displayLabel.setText(sum+"");
			
		}
		else if(e.getSource()==dotButton) {
			displayLabel.setText(".");
		}
	}

}
