package alt_tabber;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.AWTException;
import java.awt.Robot;

public class tabber implements KeyListener{
	
	public Robot r;
	
	public static void main(String[] args) throws Exception{
		
		Robot r = new Robot();
		
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
        	System.out.print("hi");
            r.keyPress(KeyEvent.VK_ALT);
    		try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    		r.keyPress(KeyEvent.VK_TAB);
    		try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    		r.keyRelease(KeyEvent.VK_TAB);
    		r.keyRelease(KeyEvent.VK_ALT);
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