package criterios_de_aceptacion_1;

import java.awt.Point;
import java.util.ArrayList;

import org.junit.Test;

import com.sun.org.apache.bcel.internal.Constants;

import main.Game;
import model.Avatar;
import model.ObjectGraphic;
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
		ArrayList<ObjectGraphic> objects = new ArrayList<>();
		objects.add(new Avatar(new Point(40,40), new Point(40,40),null));
		Game game = new Game(objects);
		game.start();
		
		//System.out.println("Nombre de la Ruta: "+game.getDataStructures().getMapTiled().route.toString());
		
	}
}
