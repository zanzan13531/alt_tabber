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

	public UI() throws Exception {

		tabber t = new tabber();

		this.text = new JLabel("Alt-Tabber");
		this.text.setFont(new Font("Consolas", Font.PLAIN, 48)); // text stuff
		this.add(this.text, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // directions when
																// closed
		setSize(400, 300); // sets a size
		this.setVisible(true);
		/*
		 * if (arg0.getKeyCode() == KeyEvent.VK_1) {
		 * System.out.println("You pressed '1'."); r.keyPress(KeyEvent.VK_1);
		 * Thread.sleep(100); r.keyRelease(KeyEvent.VK_1); Thread.sleep(500);
		 * 
		 * 
		 * }
		 */

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