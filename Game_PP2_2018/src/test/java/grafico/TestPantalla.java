package grafico;

import org.junit.Test;

public class TestPantalla {
	@Test
	public void testPantalla() {
		final int ancho= 320;
		final int alto= 320;
		//final int[] pixeles= new int[ancho*alto];

		//final int LADO_SPRITE = 32;
		//final int MASCARA_SPRITE = LADO_SPRITE - 1;
		
		Pantalla pantalla= new Pantalla(ancho, alto);
		pantalla.limpiar();
		pantalla.mostrar(ancho, alto);
		
	}
}
