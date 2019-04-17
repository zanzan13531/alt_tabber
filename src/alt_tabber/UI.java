package alt_tabber;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.AWTException;
import java.awt.Robot;
import javax.swing.*;

public class UI extends JFrame implements KeyListener{
	
	public tabber t;

	public static void main(String[] args) throws Exception{
		
		tabber t = new tabber();
		
		Thread.sleep(10000);
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
    public void keyPressed(KeyEvent e){

        if (e.getKeyCode() == KeyEvent.VK_1) {
        	
        	t.run();
        	
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