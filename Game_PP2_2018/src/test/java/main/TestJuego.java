package main;

import grafico.Pantalla;

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
		Pantalla pantalla;
		BufferedImage imagen = new BufferedImage(Constantes.ANCHO, Constantes.ALTO,
				BufferedImage.TYPE_INT_RGB);
		int [] pixeles = ((DataBufferInt) imagen.getRaster().getDataBuffer()).getData();
		final ImageIcon icono = new ImageIcon (Juego.class.getResource("/icono/icono.png"));
		
		// ventanaJuego
		final long serialVersionUID = 1L;
		JFrame ventana;
		// ventanaJuego
		
		
		
		Juego juego= new Juego();
		
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
		
		
		juego.iniciar();
		juego.detener();
		juego.actualizar();
		juego.mostrar();
		juego.run();
		
	}
}
