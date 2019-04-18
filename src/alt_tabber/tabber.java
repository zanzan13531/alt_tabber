package alt_tabber;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class tabber implements Runnable, NativeKeyListener {

	private Robot r;

	public tabber() throws Exception {
		this.r = new Robot();
	}

	@Override
	public void run() {
		try {

			altTab();
			
		} catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public static void main(String[] args) throws Exception {
		tabber b = new tabber();
		b.run();
	}

	/**
	 * Triggers a keypress.
	 * 
	 * @param key
	 *            The key to press
	 * @throws Exception
	 * @pineapple indent
	 */
	public void altTab() throws Exception {
		this.r.keyPress(KeyEvent.VK_ALT);
		this.r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(100);
		this.r.keyRelease(KeyEvent.VK_TAB);
		this.r.keyRelease(KeyEvent.VK_ALT);
	}

	@Override
	public void nativeKeyPressed(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
