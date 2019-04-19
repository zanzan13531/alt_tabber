package alt_tabber;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class alternate_tabber_test implements NativeKeyListener {

	private Robot r;

	public alternate_tabber_test() throws Exception {
		this.r = new Robot();
		//KeyEvent.getExtendedKeyCodeForChar('1');
	}

	public void nativeKeyPressed(NativeKeyEvent e) {

		if (e.getKeyCode() == NativeKeyEvent.VC_1) {
			this.r.keyPress(KeyEvent.VK_ALT);
			this.r.keyPress(KeyEvent.VK_TAB);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			this.r.keyRelease(KeyEvent.VK_TAB);
			this.r.keyRelease(KeyEvent.VK_ALT);
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_2) {
			this.r.keyPress(KeyEvent.VK_CONTROL);
			this.r.keyPress(KeyEvent.VK_WINDOWS);
			this.r.keyPress(KeyEvent.VK_LEFT);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			this.r.keyRelease(KeyEvent.VK_CONTROL);
			this.r.keyRelease(KeyEvent.VK_WINDOWS);
			this.r.keyRelease(KeyEvent.VK_LEFT);
		}
		if (e.getKeyCode() == NativeKeyEvent.VC_3) {
			this.r.keyPress(KeyEvent.VK_CONTROL);
			this.r.keyPress(KeyEvent.VK_WINDOWS);
			this.r.keyPress(KeyEvent.VK_RIGHT);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			this.r.keyRelease(KeyEvent.VK_CONTROL);
			this.r.keyRelease(KeyEvent.VK_WINDOWS);
			this.r.keyRelease(KeyEvent.VK_RIGHT);
		}
	}

	public void nativeKeyReleased(NativeKeyEvent e) {

	}

	public void nativeKeyTyped(NativeKeyEvent e) {

	}

	public static void main(String[] args) throws Exception {

		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException ex) {
			System.err.println("There was a problem registering the native hook.");
			System.err.println(ex.getMessage());

			System.exit(1);
		}

		GlobalScreen.addNativeKeyListener(new alternate_tabber_test());
	}
}
