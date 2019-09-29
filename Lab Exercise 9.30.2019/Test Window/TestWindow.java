import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TestWindow extends JFrame {
	public TestWindow()
	{
		super("Test Application");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container contentArea = getContentPane();
		contentArea.setBackground(Color.white);
		
		FlowLayout flowManager = new FlowLayout();
		contentArea.setLayout(flowManager);
		
		JButton testButton = new JButton("Test");
		contentArea.add(testButton);
		JButton testButton2 = new JButton("Test2");
		contentArea.add(testButton2);
		JButton testButton3 = new JButton("Test3");
		contentArea.add(testButton3);
		JButton testButton4 = new JButton("Test4");
		contentArea.add(testButton4);
		JButton testButton5 = new JButton("Test5");
		contentArea.add(testButton5);
		
		setContentPane(contentArea);
	}
}
