package dibujador;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.List;

import main.Constantes;
import modelo.Avatar;
import modelo.ObjectGraphic;

import org.junit.Test;

public class TestDraftsman extends Canvas implements Runnable{
	@SuppressWarnings("null")
	@Test
	public void testDraftsman() {
		Point coordinate= new Point(100,100);
		Point size= new Point(40,40);
		BufferedImage imagen = new BufferedImage(Constantes.ANCHO, Constantes.ALTO,BufferedImage.TYPE_INT_RGB);
		ObjectGraphic objectGraphic= new ObjectGraphic(coordinate, size, imagen);
		Avatar avatar= new Avatar(coordinate, size, imagen);
		String CONTADOR_APS = "";
		String CONTADOR_FPS = "";
		
		/*BufferStrategy estrategia = getBufferStrategy();
		if (estrategia == null) {
			createBufferStrategy(3);
			return;
		}
		
		Graphics g = estrategia.getDrawGraphics();
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), null);
		g.drawString(CONTADOR_APS, 10, 20);
		g.drawString(CONTADOR_FPS, 10, 35);
		g.drawString("Alto de pantalla: " + getHeight(), 10, 55);
		g.drawString("Ancho de pantalla: " + getWidth(), 10, 75);
		g.dispose();
		//DraftsmanObjectGraphic drafts= new DraftsmanObjectGraphic(objectGraphic, g);
		List<ObjectGraphic> listObjectGraphics = null;
		listObjectGraphics.add(objectGraphic);
		Draftsman d= new Draftsman(listObjectGraphics, g);
		d.drawAllObjects();
		d.drawAvatarGame(avatar);*/
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
