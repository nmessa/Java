import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Actions extends JFrame implements ActionListener{
	JTextArea textarea = new JTextArea(2, 25);
	JButton button1 = new JButton("Button #1");
	JButton button2 = new JButton("Button #2");
	
	public Actions()
	{
		super("Action Events");
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container content = getContentPane();
		FlowLayout layout = new FlowLayout();
		content.setLayout(layout);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		content.add(button1);
		content.add(button2);
		content.add(textarea);
		setContentPane(content);
	} // end of constuctor
	
	public void actionPerformed(ActionEvent event)
	{
		String str = "From: " + event.getActionCommand();
		if (event.getSource() == button1)
			str += " - No. 1";
		if (event.getSource() == button2)
			str += " - No. 2";
		textarea.setText(str);
	}
}
