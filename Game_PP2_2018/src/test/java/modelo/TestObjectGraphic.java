package modelo;

import java.awt.Point;
import java.awt.image.BufferedImage;

import main.Constants;
//import model.Avatar;
import model.ObjectGraphic;

import org.junit.Test;

public class TestObjectGraphic {
	@Test
	public void testObjectGraphic(){
		Point coordinate= new Point(100,100);
		Point size= new Point(40,40);
		BufferedImage imagen = new BufferedImage(Constants.WIDTH, Constants.HEIGHT,BufferedImage.TYPE_INT_RGB);;
		//Avatar avatar= new Avatar(coordinate, size, imagen);
		
		ObjectGraphic o_1 = new ObjectGraphic(coordinate, size, imagen);
		ObjectGraphic o_2 = new ObjectGraphic(imagen);
		ObjectGraphic o_3 = new ObjectGraphic(coordinate, size);
		
		o_1.getCoordinate();
		o_1.getImage();
		o_1.getSize();
		o_2.setImage(imagen);
		o_3.setCoordinate(coordinate);
		o_3.setSize(size);
	}
}
