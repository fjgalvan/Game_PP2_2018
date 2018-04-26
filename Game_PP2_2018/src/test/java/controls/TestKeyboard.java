package controls;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.junit.Test;

import control.Teclado;

public class TestKeyboard implements KeyListener{
	@SuppressWarnings("unused")
	private Teclado keyListener;
	@Test
	public void testKeyboard(){
		Keyboard k= new Keyboard();
		//Integer keyPressedInNow = keyListener.getKeyPressed();
		/*KeyEvent event = null;
		k.keyPressed(event);
		k.keyReleased(event);*/
		//k.keyTyped(keyPressedInNow);
		
		
		/*try
		{
			Robot robot = new Robot();
			// abriendo el menu inicio
			robot.keyPress(KeyEvent.VK_WINDOWS);
			robot.keyRelease(KeyEvent.VK_WINDOWS);
		/*	// lanzando el explorerador
			robot.keyPress(KeyEvent.VK_WINDOWS);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_WINDOWS); */
			
		/*	KeyEvent event = null;
			k.keyPressed(event);
			k.keyReleased(event);
		} 
			catch (AWTException e)
			{
			e.printStackTrace();
			}*/
			
		}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
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
