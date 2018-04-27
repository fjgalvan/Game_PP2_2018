package criterios_de_aceptacion_1;

import java.awt.Point;
import java.util.ArrayList;

import org.junit.Test;

import main.Game;
import model.Avatar;
import model.ObjectGraphic;
import views.PrincipalView;


/**
 * Testear que se realicen actualizaciones cada un segundo transcurrido. (02:00 hs).
 *
 * Criterio de aceptación:
 * Que el estado de un objeto sea diferente después de un segundo de haber realizado alguna acción.
 */
public class Test_User_Story_1 {
	@Test
	public static void main(String[] args) {
		PrincipalView principalView= new PrincipalView();
		
		principalView.getFrmPrincipalView().dispose();
		ArrayList<ObjectGraphic> objects = new ArrayList<>();
		objects.add(new Avatar(new Point(40,40), new Point(40,40),null));
		Game game = new Game(objects);
		game.start();
		
		game.show();
		System.out.println("contador_aps: "+ game.getCONTADOR_APS());
		System.out.println("contador_aps: "+ game.getCONTADOR_FPS());
		
		//game.run();
		//game.stop();
		System.out.println("contador_aps2: "+ game.getCONTADOR_APS());
		System.out.println("contador_aps2: "+ game.getCONTADOR_FPS());
		
		
	}
}
