package control;

import java.awt.Point;
import java.awt.event.KeyEvent; 
//import java.awt.event.KeyListener;

import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import main.Constantes;
import modelo.Avatar;

import org.junit.Test;

import states.StateMove;




public class TestTeclado implements KeyListener{
	

	@SuppressWarnings("unused")
	@Test
	public void testTeclado() {
		final int numeroTeclas = 120;
		final boolean[] teclas = new boolean[numeroTeclas];

		boolean arriba= teclas[KeyEvent.VK_W]; // la tecla arriba equivale a pulsar W;
		boolean abajo= teclas[KeyEvent.VK_S]; // la tecla arriba equivale a pulsar S
		boolean izquierda= teclas[KeyEvent.VK_A]; // la tecla arriba equivale a pulsar A
		boolean derecha= teclas[KeyEvent.VK_D]; // la tecla arriba equivale a pulsar D
		//boolean space= false;
		//@SuppressWarnings("deprecation")
		//KeyEvent e= new KeyEvent(null, numeroTeclas, numeroTeclas, numeroTeclas, numeroTeclas);
		
		Teclado teclado= new Teclado();
		teclado.arriba= arriba;
		teclado.abajo= abajo;
		teclado.izquierda= izquierda;
		teclado.derecha= derecha;
		
		
		Point coordinate= new Point(100,100);
		Point size= new Point(40,40);
		BufferedImage imagen = new BufferedImage(Constantes.ANCHO, Constantes.ALTO,BufferedImage.TYPE_INT_RGB);;
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

		teclado.actualizar();
		/*KeyEvent KeyEvent = new KeyEvent();
		teclado.keyPressed(KeyEvent);
		teclado.keyReleased(KeyEvent);*/
		//teclado.keyTyped(arriba);
		
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
