import javax.swing.*;
import java.awt.*;

public class ColorPanels extends JFrame{
	
	public ColorPanels(){
		
		setLayout(null);
		setSize(1000,450);
		setTitle("Color Panel");
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainPanel.setSize(1000,450);
		mainPanel.setBackground(Color.GRAY);
		
		JPanel redPanel = new JPanel();
		redPanel.setLayout(null);
		redPanel.setSize(200,200);
		redPanel.setLocation(100,100);
		redPanel.setBackground(Color.RED);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setLayout(null);
		bluePanel.setSize(200,200);
		bluePanel.setLocation(375,100);
		bluePanel.setBackground(Color.BLUE);
		
		JPanel yellowPanel = new JPanel();
		yellowPanel.setLayout(null);
		yellowPanel.setSize(200,200);
		yellowPanel.setLocation(650,100);
		yellowPanel.setBackground(Color.YELLOW);
		
		JButton redButton = new JButton("RED");
		redButton.setBounds(150, 315, 100, 35);
		
		JButton blueButton = new JButton("BLUE");
		blueButton.setBounds(425, 315, 100, 35);
		
		JButton yellowButton = new JButton("YELLOW");
		yellowButton.setBounds(700, 315, 100, 35);
		
		JLabel redLabel = new JLabel("Red");
		redLabel.setForeground(Color.RED);
		redLabel.setBounds(185, 50, 100, 35);
		
		JLabel blueLabel = new JLabel("Blue");
		blueLabel.setForeground(Color.BLUE);
		blueLabel.setBounds(460, 50, 100, 35);
		
		JLabel yellowLabel = new JLabel("Yellow");
		yellowLabel.setForeground(Color.YELLOW);
		yellowLabel.setBounds(735, 50, 100, 35);
		
		
		add(mainPanel);
		mainPanel.add(redPanel);
		mainPanel.add(bluePanel);
		mainPanel.add(yellowPanel);
		mainPanel.add(redButton);
		mainPanel.add(blueButton);
		mainPanel.add(yellowButton);
		mainPanel.add(redLabel);
		mainPanel.add(blueLabel);
		mainPanel.add(yellowLabel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		ColorPanels t = new ColorPanels();

	}

}
