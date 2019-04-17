package alt_tabber;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Robot;
import javax.swing.*;

public class UI extends JFrame implements KeyListener {

	private tabber t;
	private JLabel text;
	private JButton startButton;

	public UI() throws Exception {

		tabber t = new tabber();
		
		this.startButton = new JButton("Alt-Tab"); //making the start button
		this.startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //actions when pressing the start button
				t.run(); //starts the program
			}
		});
		this.startButton.setVisible(true);
		this.add(startButton, BorderLayout.NORTH); //places button
		this.startButton.setVisible(true);
		
		this.text = new JLabel("Alt-Tabber");
		this.text.setFont(new Font("Consolas", Font.PLAIN, 48)); // text stuff
		this.add(this.text, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // directions when
																// closed
		setSize(400, 300); // sets a size
		this.setVisible(true);
		
		

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_1) {

			t.run();
			System.out.println("hi");

		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}