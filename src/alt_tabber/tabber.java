package alt_tabber;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.AWTException;
import java.awt.Robot;

public class tabber {
	
	public static void main(String[] args) throws Exception{
		
		Robot r = new Robot();
		/*
		if (arg0.getKeyCode() == KeyEvent.VK_1) {
			System.out.println("You pressed '1'.");
			r.keyPress(KeyEvent.VK_1);
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_1);
			Thread.sleep(500);
		
		
		}
		*/
	
	
	}
	
	@Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key pressed");
        }

    }
	
}