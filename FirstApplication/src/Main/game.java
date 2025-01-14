package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class game {
	
	private static int number = 0;
	
	public static void main(String[] args) {
		
		//creating the JFrame
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Testing Application");
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		//adding the button
		JButton messageButton = new JButton("TRY ME");
		messageButton.setBounds(200, 200, 200, 100);
		window.add(messageButton);
		
		//adding action listener
		messageButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				number += 1;
				System.out.println("Number:" + number);
			}
		});
		
		
		//System.out.println("Hello World!");
	}
}
