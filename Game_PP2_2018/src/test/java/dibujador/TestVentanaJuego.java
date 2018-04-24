package dibujador;

import java.awt.Canvas;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import main.Constants;
import model.Avatar;
import model.ObjectGraphic;

import org.junit.Test;

import drawer.Draw;
import drawer.ViewGame;

public class TestVentanaJuego extends Canvas{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Test
	public void testVentanaJuego () {
		Point coordinate= new Point(100,100);
		Point size= new Point(40,40);
		BufferedImage imagen = new BufferedImage(Constants.WIDTH, Constants.HEIGHT,BufferedImage.TYPE_INT_RGB);;
		Avatar avatar= new Avatar(coordinate, size, imagen);
		
		//ArrayList<String> nombreArrayList = new ArrayList<String>();
		ArrayList<ObjectGraphic> data = new ArrayList<ObjectGraphic>();
		data.add(avatar);
		Draw draw= new Draw(data);
		ViewGame ventana= new ViewGame(draw);
		ventana.configureView(draw);
	}
}
