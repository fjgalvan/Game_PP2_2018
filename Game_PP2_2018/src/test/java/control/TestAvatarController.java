package control;

import java.awt.Point; 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import main.Constants;
import model.Avatar;

import org.junit.Test;

import states.StateMove;

public class TestAvatarController implements KeyListener{
	@Test
	public void testAvatarController() {
		
		Point coordinate= new Point(100,100);
		Point size= new Point(40,40);
		BufferedImage imagen = new BufferedImage(Constants.WIDTH, Constants.HEIGHT,BufferedImage.TYPE_INT_RGB);;
		Avatar avatar= new Avatar(coordinate, size, imagen);
		
		SetKeys setkeys= new SetKeys(1, 2, 3, 4, 5) ;
		AvatarController avaControl= new AvatarController(avatar);
		Teclado keyListener= new Teclado();
		FactoryStateMove factory= new FactoryStateMove(setkeys);
		
		//avaControl.controlAvatar();
		Integer keyPressedInNow = keyListener.getKeyPressed();
		if(keyPressedInNow != -1) 
		{
			StateMove stateMove = factory.getStateMove(keyPressedInNow);
			avatar.setStateMove(stateMove);
			avatar.doActionStateMove();
		}
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
