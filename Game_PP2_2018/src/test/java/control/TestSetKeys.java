package control;

import java.awt.Point;
import java.awt.image.BufferedImage;

import main.Constantes;
import modelo.Avatar;

import org.junit.Test;

public class TestSetKeys {
	@SuppressWarnings("unused")
	@Test
	public void testAvatarController() {
		Point coordinate= new Point(100,100);
		Point size= new Point(40,40);
		BufferedImage imagen = new BufferedImage(Constantes.ANCHO, Constantes.ALTO,BufferedImage.TYPE_INT_RGB);;
		Avatar avatar= new Avatar(coordinate, size, imagen);
		
		SetKeys setkeys= new SetKeys(1, 2, 3, 4, 5) ;
		AvatarController avaControl= new AvatarController(avatar);
		Teclado keyListener= new Teclado();
		FactoryStateMove factory= new FactoryStateMove(setkeys);
		
		setkeys.getKeyDown();
		setkeys.getKeyLeft();
		setkeys.getKeyRight();
		setkeys.getKeyShoot();
		setkeys.getKeyUp();
	}
}
