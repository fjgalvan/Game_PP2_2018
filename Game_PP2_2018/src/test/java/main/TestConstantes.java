package main;

import org.junit.Test;

public class TestConstantes {
	@Test
	public void testConstantes() {
		@SuppressWarnings("unused")
		final int ANCHO = 1000;
		@SuppressWarnings("unused")
		final int ALTO = 600;
		@SuppressWarnings("unused")
		final String NOMBREJUEGO = "Battle-UNGS";
		
		Constantes.getAlto();
		Constantes.getAncho();
		Constantes.getNombrejuego();
	}
}
