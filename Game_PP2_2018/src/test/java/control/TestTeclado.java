package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.junit.Test;




public class TestTeclado {
	

	@Test
	public void testTeclado() {
		final int numeroTeclas = 120;
		final boolean[] teclas = new boolean[numeroTeclas];

		boolean arriba= teclas[KeyEvent.VK_W]; // la tecla arriba equivale a pulsar W;
		boolean abajo= teclas[KeyEvent.VK_S]; // la tecla arriba equivale a pulsar S
		boolean izquierda= teclas[KeyEvent.VK_A]; // la tecla arriba equivale a pulsar A
		boolean derecha= teclas[KeyEvent.VK_D]; // la tecla arriba equivale a pulsar D
		boolean space= false;
		//@SuppressWarnings("deprecation")
		//KeyEvent e= new KeyEvent(null, numeroTeclas, numeroTeclas, numeroTeclas, numeroTeclas);
		
		Teclado teclado= new Teclado();
		teclado.arriba= arriba;
		teclado.abajo= abajo;
		teclado.izquierda= izquierda;
		teclado.derecha= derecha;
		

		teclado.actualizar();
		/*KeyEvent KeyEvent = null;
		teclado.keyPressed(KeyEvent);
		teclado.keyReleased(KeyEvent);*/
		//teclado.keyTyped(arriba);
		
	}
}
