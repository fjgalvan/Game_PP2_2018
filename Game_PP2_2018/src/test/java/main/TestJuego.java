package main;

//import grafico.Pantalla; 

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import org.junit.Test;

import control.Teclado;

public class TestJuego {
	@SuppressWarnings("unused")
	@Test
	public void testJuego() {
		Thread thread; // agregamos el volatile porque estamos usando 2 threads
		boolean enFuncionamiento = false;
		int aps = 0; // actualizaciones por segundo
		int fps = 0; // frames por segundo
		//Teclado teclado;
		int x = 0;
		int y = 0;
		String CONTADOR_APS = "";
		String CONTADOR_FPS = "";
		//Pantalla pantalla;
		BufferedImage imagen = new BufferedImage(Constants.WIDTH, Constants.HEIGHT,
				BufferedImage.TYPE_INT_RGB);
		int [] pixeles = ((DataBufferInt) imagen.getRaster().getDataBuffer()).getData();
		final ImageIcon icono = new ImageIcon (Game.class.getResource("/icono/icono.png"));
		
		// ventanaJuego
		final long serialVersionUID = 1L;
		JFrame ventana;
		// ventanaJuego
		
		
		
		Game juego= new Game();
		
		final int numeroTeclas = 120;
		final boolean[] teclas = new boolean[numeroTeclas];
		boolean arriba= teclas[KeyEvent.VK_W]; // la tecla arriba equivale a pulsar W;
		boolean abajo= teclas[KeyEvent.VK_S]; // la tecla arriba equivale a pulsar S
		boolean izquierda= teclas[KeyEvent.VK_A]; // la tecla arriba equivale a pulsar A
		boolean derecha= teclas[KeyEvent.VK_D]; // la tecla arriba equivale a pulsar D
		Teclado teclado= new Teclado();
		teclado.arriba= arriba;
		teclado.abajo= abajo;
		teclado.izquierda= izquierda;
		teclado.derecha= derecha;
		
		teclado.actualizar();
		
		
		/*juego.start();
		juego.update();
		for(int i=0; i<1; i++){
			//juego.run(); //NO LO PUEDO DETENER !!!!
			try{
			    Robot robot = new Robot();
			    robot.keyPress(KeyEvent.VK_ESCAPE);
			   }catch(AWTException a){
			    a.printStackTrace();
			   }
			
			Game.getCONTADOR_APS();
			Game.getCONTADOR_FPS();
			juego.stop();
		}*/
		
		
	}
}
