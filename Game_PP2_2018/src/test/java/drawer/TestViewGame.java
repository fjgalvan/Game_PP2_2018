package drawer;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import main.Constants;
import model.Avatar;
import model.ObjectGraphic;

import org.junit.Test;

public class TestViewGame {
	@Test
	public void testViewGame() {
		Point coordinate= new Point(100,100);
		Point size= new Point(40,40);
		BufferedImage imagen = new BufferedImage(Constants.WIDTH, Constants.HEIGHT,BufferedImage.TYPE_INT_RGB);;
		Avatar avatar= new Avatar(coordinate, size, imagen);
		
		ArrayList<ObjectGraphic> data= new ArrayList<ObjectGraphic>();
		data.add(avatar);
		Draw d = new Draw(data);
		
		try{
			d.DrawImages();
		}catch(Exception e){
		}
		
		ViewGame view= new ViewGame(d);
		view.configureView(d);	
	}
}
