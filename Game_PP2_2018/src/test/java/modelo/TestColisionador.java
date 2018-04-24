package modelo;

import java.awt.Point;
import java.awt.image.BufferedImage;

import main.Constants;
import model.Avatar;
import model.Colisionador;
import model.MapValues;
import model.SetDataCorner;
import model.TypeCorner;

import org.junit.Test;

public class TestColisionador {
	@Test
	public void testColisionador(){
		Point coordinate= new Point(100,100);
		Point size= new Point(40,40);
		BufferedImage imagen = new BufferedImage(Constants.WIDTH, Constants.HEIGHT,BufferedImage.TYPE_INT_RGB);;
		Avatar avatar= new Avatar(coordinate, size, imagen);
		Avatar avatar2= new Avatar(coordinate, size, imagen);
		
		SetDataCorner setDataCorner= new SetDataCorner(40,100,40,100);
		
		MapValues map= new MapValues(setDataCorner);
		
		Colisionador c= new Colisionador(map);
		
		c.hasColision(avatar, avatar2);
		c.hasColisionWithCorner(TypeCorner.MAXHEIGHT, avatar);
	}
}
