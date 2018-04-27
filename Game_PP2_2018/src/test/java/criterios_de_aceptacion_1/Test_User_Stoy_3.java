package criterios_de_aceptacion_1;

import org.junit.Test;

import main.Game;
import views.PrincipalView;

/**
 * 
 * Criterio de aceptación: 
 * Que los mapas sean del formato .csv.
 *
 */
public class Test_User_Stoy_3 {
	
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrincipalView principalView= new PrincipalView();
		
		principalView.getFrmPrincipalView().dispose();
		Game game = new Game();
		game.start();
		
		System.out.println("Nombre de la Ruta: "+game.getDataStructures().getMapTiled().route.toString());
		
	}
}
