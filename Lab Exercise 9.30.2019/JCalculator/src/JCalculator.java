/**
 * @(#)JCalculator.java
 *
 * JCalculator Applet application
 *
 * @nmessa 
 * @version 1.00 2014/10/31
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JCalculator extends JApplet implements ActionListener 
{
	JTextField number;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	JButton bDot, bAdd, bSub, bMult, bDiv, bEquals;
	JButton bChangeSign, bClear, bPow;
	Boolean firstNumber = true;
	String str="";
	char operator = '\0';
	double first=0.0, second=0.0;

	public void init() {
		//Construct components
		number = new JTextField(15);
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bDot = new JButton(".");
		bAdd = new JButton("+");
		bSub = new JButton("-");
		bMult = new JButton("x");
		bDiv = new JButton("/");
		bPow = new JButton("X^Y");
		bClear = new JButton("C");
		bEquals = new JButton("=");
		bChangeSign = new JButton("+/-");
		number.setHorizontalAlignment(JTextField.RIGHT);
		
		// Add actionListeners
		b0.addActionListener(this);
		b1.addActionListener(this);
      	b2.addActionListener(this);
      	b3.addActionListener(this);
      	b4.addActionListener(this);
      	b5.addActionListener(this);
      	b6.addActionListener(this);
      	b7.addActionListener(this);
      	b8.addActionListener(this);
      	b9.addActionListener(this);
      	bDot.addActionListener(this);
      	bAdd.addActionListener(this);
      	bSub.addActionListener(this);
      	bMult.addActionListener(this);
      	bDiv.addActionListener(this);
      	bClear.addActionListener(this);
      	bPow.addActionListener(this);
      	bEquals.addActionListener(this);
      	bChangeSign.addActionListener(this);
      	
      	// Create containers
		Container container = getContentPane();
      	container.setLayout( new FlowLayout() );
      	Box box = Box.createHorizontalBox();
      	
      	// add components
      	box.add(number);
      	container.add(box, BorderLayout.NORTH);
      	container.add(b0, BorderLayout.CENTER);
      	container.add(b1, BorderLayout.CENTER);
      	container.add(b2, BorderLayout.CENTER);
      	container.add(bAdd, BorderLayout.CENTER);
      	container.add(b3, BorderLayout.CENTER);
      	container.add(b4, BorderLayout.CENTER);
      	container.add(b5, BorderLayout.CENTER);
      	container.add(bSub, BorderLayout.CENTER);
      	container.add(b6, BorderLayout.CENTER);
      	container.add(b7, BorderLayout.CENTER);
      	container.add(b8, BorderLayout.CENTER);
      	container.add(bMult, BorderLayout.CENTER);
      	container.add(b9, BorderLayout.CENTER);
      	container.add(bDot, BorderLayout.CENTER);
      	container.add(bChangeSign, BorderLayout.CENTER);
      	container.add(bDiv, BorderLayout.CENTER);
      	container.add(bPow, BorderLayout.CENTER);
      	container.add(bClear, BorderLayout.CENTER);
      	container.add(bEquals, BorderLayout.CENTER);

	}

	public void paint(Graphics g) {
		
		
		
	}
	
	public void actionPerformed(ActionEvent event){
		double answer = 0.0;
		if (firstNumber)
		{
			if (event.getSource( ) == b0)
			{
				str += "0";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			if (event.getSource( ) == b1)
			{
				str += "1";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			if (event.getSource( ) == b2)
			{
				str += "2";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			if (event.getSource( ) == b3)
			{
				str += "3";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			if (event.getSource( ) == b4)
			{
				str += "4";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}

			if (event.getSource( ) == b5)
			{
				str += "5";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			if (event.getSource( ) == b6)
			{
				str += "6";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			if (event.getSource( ) == b7)
			{
				str += "7";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}if (event.getSource( ) == b8)
			{
				str += "8";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			if (event.getSource( ) == b9)
			{
				str += "9";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			if (event.getSource( ) == bDot)
			{
				str += ".";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			if (event.getSource( ) == bChangeSign)
			{
				first = -1 * Double.parseDouble(str);
				str = Double.toString(first);
				number.setText(str);
			}

			if (event.getSource( ) == bAdd)
			{
				first = Double.parseDouble(str);
				str = "";
				number.setText(str);
				operator = '+';
				firstNumber = false;
			}
			
			if (event.getSource( ) == bSub)
			{
				first = Double.parseDouble(str);
				str = "";
				number.setText(str);
				operator = '-';
				firstNumber = false;
			}
			
			if (event.getSource( ) == bMult)
			{
				first = Double.parseDouble(str);
				str = "";
				number.setText(str);
				operator = 'x';
				firstNumber = false;
			}
			
			if (event.getSource( ) == bDiv)
			{
				first = Double.parseDouble(str);
				str = "";
				number.setText(str);
				operator = '/';
				firstNumber = false;
			}
			
			if (event.getSource( ) == bPow)
			{
				first = Double.parseDouble(str);
				str = "";
				number.setText(str);
				operator = '^';
				firstNumber = false;
			}
			
			if (event.getSource( ) == bClear)
			{
				str = "";
				number.setText(str);
			}
		} //end of first number if
		
		if (!firstNumber)
		{
			if (event.getSource( ) == b0)
			{
				str += "0";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			
			if (event.getSource( ) == b1)
			{
				str += "1";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			
			if (event.getSource( ) == b2)
			{
				str += "2";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			
			if (event.getSource( ) == b3)
			{
				str += "3";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			
			if (event.getSource( ) == b4)
			{
				str += "4";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			if (event.getSource( ) == b5)
			{
				str += "5";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			
			if (event.getSource( ) == b6)
			{
				str += "6";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}

			if (event.getSource( ) == b7)
			{
				str += "7";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			
			if (event.getSource( ) == b8)
			{
				str += "8";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			
			if (event.getSource( ) == b9)
			{
				str += "9";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			
			if (event.getSource( ) == bDot)
			{
				str += ".";
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
			}
			
			if (event.getSource( ) == bChangeSign)
			{
				first = -1 * Double.parseDouble(str);
				str = Double.toString(first);
				number.setText(str);
			}
			if (event.getSource( ) == bEquals)
			{
				second = Double.parseDouble(str);
				switch (operator)
				{
					case '+': answer = first + second;
								break;
					case '-': answer = first - second;
								break;
					case 'x': answer = first * second;
								break;
					case '/': answer = first / second;
								break;
					case '^': answer = Math.pow(first, second);
								break;
				}
				str = Double.toString(answer);
				number.setHorizontalAlignment(JTextField.RIGHT);
				number.setText(str);
				firstNumber = true;
			}
		} //end of not first number if
		
		if (event.getSource( ) == bClear)
		{
			str = "";
			number.setText(str);
			first = 0.0;
			second = 0.0;
			operator ='\0';
		} 
	}//end of actionPerformed
}//end of JCalculator class