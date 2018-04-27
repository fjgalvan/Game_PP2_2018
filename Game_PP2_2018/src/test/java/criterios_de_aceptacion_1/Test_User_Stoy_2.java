package criterios_de_aceptacion_1;

import java.awt.Point;
import java.util.ArrayList;

import org.junit.Test;

import main.Game;
import model.Avatar;
import model.ObjectGraphic;
import views.PrincipalView;

/**
 * 
 * Criterio de aceptación:
 * 
 *  Mostrar una pantalla que contenga las dimensiones correctas ( 1000x600 pixeles).
 * 
 * Que el dibujador muestre con la posición, dimensión e imagen correspondientes a los objetos gráficos.
 *
 */
public class Test_User_Stoy_2 {
	
	@Test
	public static void main(String[] args) {
		
		
		PrincipalView principalView= new PrincipalView();
		principalView.getFrmPrincipalView().dispose();
		ArrayList<ObjectGraphic> objects = new ArrayList<>();
		objects.add(new Avatar(new Point(40,40), new Point(40,40),null));
		Game game = new Game(objects);
		game.start();
		
		System.out.println("ALTO:  "+game.getDraw().getHeight());
		System.out.println("ANCHO:  "+game.getDraw().getWidth());
		
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
