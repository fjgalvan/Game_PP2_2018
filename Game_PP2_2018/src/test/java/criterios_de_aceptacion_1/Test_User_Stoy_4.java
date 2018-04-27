package criterios_de_aceptacion_1;

import main.Game;
import views.PrincipalView;

/**
 * 
 * Criterio de aceptación: 
 * Controlar que el archivo a leer exista, en caso contrario que envíe una alerta diciendo que no existe o está mal el nombre del archivo.
 * Controlar que las estructuras del juego sean creadas, por los datos pasados por el mapa (.csv).
 *
 */
public class Test_User_Stoy_4 {
	
	public static void main(String[] args) {
		PrincipalView principalView= new PrincipalView();
		
		principalView.getFrmPrincipalView().dispose();
		Game game = new Game();
		game.start();
		
		//Primer test
		System.out.println("¿Existe el archivo .csv del mapa a leer?: "+game.getDataStructures().getMapTiled().routeExist());
		
		//Segundo Test
		for(int i=0; i< game.getDataStructures().getMapTiled().typeOfStructures.size();i++){
			System.out.println("Tipo de Objeto: "+ game.getDataStructures().getMapTiled().typeOfStructures.get(i).toString());
		}
		
		
	}
}
