package claseProperties;

import org.junit.Test;


public class TestPrincipal {
	@Test
	public void testPrincipal(){
		Principal principal= new Principal();
		//incipal.leerArchivo();
		
		String tecla_movimiento_arriba="w";
		String tecla_movimiento_abajo="s";
		String tecla_movimiento_izquierda="a";
		String tecla_movimiento_derecha="d";
		String tecla_disparo="space";
		int personaje1_posX=100;
		int personaje1_posY=100;
		int personaje1_height=40;
		int personaje1_width=40;
		String personaje1_string_imagen="Image";
		
		EleccionMenu menu= new EleccionMenu(tecla_movimiento_arriba, tecla_movimiento_abajo, tecla_movimiento_izquierda,
				tecla_movimiento_derecha, tecla_disparo, personaje1_posX, personaje1_posY, personaje1_height, 
				personaje1_width, personaje1_string_imagen);
	
		principal.modificarArchivo(menu);
		principal.leerArchivo();
	}
}
