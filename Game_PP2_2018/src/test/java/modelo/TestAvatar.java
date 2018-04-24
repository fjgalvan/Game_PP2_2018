package modelo;

import java.awt.Point;
import java.awt.image.BufferedImage;

import org.junit.Test;

import main.Constants;
import model.Avatar;

public class TestAvatar /*extends ObjectGraphic*/{
	
	/*public TestAvatar(Point coordinate, Point size, BufferedImage image) {
		super(coordinate, size, image);
		// TODO Auto-generated constructor stub
	}*/

	@SuppressWarnings("unused")
	@Test
	public void TestAvatar() {
		Point coordinate= new Point(100,100);
		Point size= new Point(40,40);
		BufferedImage imagen = new BufferedImage(Constants.WIDTH, Constants.HEIGHT,BufferedImage.TYPE_INT_RGB);;
		Avatar avatar= new Avatar(coordinate, size, imagen);
		
		//StateMove s= new StateMove();
	}

}
