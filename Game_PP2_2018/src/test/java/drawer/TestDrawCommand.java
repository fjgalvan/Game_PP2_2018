package drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import main.Constants;
import model.Avatar;
import model.ObjectGraphic;

import org.junit.Test;

public class TestDrawCommand extends Canvas implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Test
	public void testDrawCommand() {
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
		
		//DrawCommand draw= new DrawCommand();
		BufferStrategy buffer = this.getBufferStrategy();
		if(buffer == null) {
			//createBufferStrategy(3);
			return;
		}
		Graphics2D g = (Graphics2D) buffer.getDrawGraphics();
		
		g.setColor (Color.blue);
        g.drawLine (0, 70, 100, 70);
        g.drawRect (150, 70, 50, 70);
        g.drawRoundRect (250, 70, 50, 70, 6, 6);
        g.drawOval (350, 70, 50, 70);
        int [] vx1 = {500, 550, 450};
        int [] vy1 = {70, 120, 120};
        g.drawPolygon (vx1, vy1, 3);
		
		
		BufferedImage img= new BufferedImage(Constants.WIDTH, Constants.HEIGHT,BufferedImage.TYPE_INT_RGB);
		Point p= new Point(40,40);
		String s= "s";
		int x= 100;
		int y= 100;
		int ancho= 40;
		int alto= 40;
		Color c= Color.BLACK;
		
		DrawCommand.drawImage(g, img, p);
		DrawCommand.drawString(g, s, x, y);
		DrawCommand.drawRectangleFill(g, x, y, ancho, alto, c);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
