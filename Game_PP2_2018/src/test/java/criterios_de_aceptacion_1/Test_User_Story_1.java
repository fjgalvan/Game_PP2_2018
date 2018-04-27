package criterios_de_aceptacion_1;

import main.Game;
import views.PrincipalView;


/**
 * 
 * Criterio de aceptación 1:
 * Mostrar una pantalla que contenga las dimensiones correctas ( 1000x600 pixeles).
 *
 */
public class Test_User_Story_1 {
	public static void main(String[] args) {
		PrincipalView principalView= new PrincipalView();
	
		principalView.getFrmPrincipalView().dispose();
		Game game = new Game();
		game.start();
		
		System.out.println("ALTO:  "+game.getDraw().getHeight());
		System.out.println("ANCHO:  "+game.getDraw().getWidth());
		
	}
}
