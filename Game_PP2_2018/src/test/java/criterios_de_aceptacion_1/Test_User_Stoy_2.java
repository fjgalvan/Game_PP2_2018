package criterios_de_aceptacion_1;

import org.junit.Test;

import main.Game;
import views.PrincipalView;

/**
 * 
 * Criterio de aceptación:
 * Que el dibujador muestre con la posición, dimensión e imagen correspondientes a los objetos gráficos.
 *
 */
public class Test_User_Stoy_2 {
	
	@Test
	public static void main(String[] args) {
		
		PrincipalView principalView= new PrincipalView();
		
		principalView.getFrmPrincipalView().dispose();
		Game game = new Game();
		game.start();
		
		//Objeto 1
		System.out.println("Tamaño de objeto 1 : ("+game.getDraw().getData().get(0).getSize().getX()
				                                   +" ,"+game.getDraw().getData().get(0).getSize().getY()+")");
		
		System.out.println("Coordenada del objeto 1 : ("+game.getDraw().getData().get(0).getCoordinate().getX()
													+" ,"+	game.getDraw().getData().get(0).getCoordinate().getY()+")\n");
		//System.out.println("Nombre del objeto de estructura : ("+game.getDataStructures().getObjects().get(0).getCoordinate().getX() +" ,"+game.getDataStructures().getObjects().get(0).getCoordinate().getY()+")");
		
		//Objeto 2
		System.out.println("Tamaño de objeto 2 : ("+game.getDraw().getData().get(1).getSize().getX()
                +" ,"+game.getDraw().getData().get(1).getSize().getY()+")");
		
		
		System.out.println("Coordenada del objeto 2 : ("+game.getDraw().getData().get(1).getCoordinate().getX()
					+" ,"+	game.getDraw().getData().get(1).getCoordinate().getY()+")\n");
		
		//Objeto 10
		System.out.println("Tamaño de objeto 10 : ("+game.getDraw().getData().get(9).getSize().getX()
                +" ,"+game.getDraw().getData().get(9).getSize().getY()+")");

		System.out.println("Coordenada del objeto 10 : ("+game.getDraw().getData().get(9).getCoordinate().getX()
					+" ,"+	game.getDraw().getData().get(9).getCoordinate().getY()+")");	
	}
}
