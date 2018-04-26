package serializable_data;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import main.Constants;
import model.Avatar;
import model.ObjectGraphic;

import org.junit.Test;

public class TestData {
	@SuppressWarnings("unused")
	@Test
	public void testData(){
		
		Point coordinate= new Point(100,100);
		Point size= new Point(40,40);
		BufferedImage imagen = new BufferedImage(Constants.WIDTH, Constants.HEIGHT,BufferedImage.TYPE_INT_RGB);;
		Avatar avatar= new Avatar(coordinate, size, imagen);
		
		ArrayList<ObjectGraphic> list= new ArrayList<ObjectGraphic>();
		list.add(avatar);
		Data d= new Data(list);
		
		try {
			d.serializarArchivo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try {
			d.leerArchivo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}

