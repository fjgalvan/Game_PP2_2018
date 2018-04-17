package main;

import grafico.Pantalla;

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
		Teclado teclado;
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
		
		juego.iniciar();
		juego.detener();
		juego.actualizar();
		juego.mostrar();
		juego.run();
		
	}
}
