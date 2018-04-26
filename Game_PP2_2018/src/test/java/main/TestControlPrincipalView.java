package main;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

import model.Avatar;

import org.junit.Test;

//import views.PrincipalView;

public class TestControlPrincipalView {
	@Test
	public void testControlPrincipalView() {
		Point coordinate= new Point(100,100);
		Point size= new Point(40,40);
		BufferedImage imagen = new BufferedImage(Constants.WIDTH, Constants.HEIGHT,BufferedImage.TYPE_INT_RGB);;
		Avatar avatar= new Avatar(coordinate, size, imagen);
		
		//PrincipalView principalView= new PrincipalView();
		
		ControlPrincipalView c= new ControlPrincipalView();
		
		c.iniciar();
		
		ActionEvent e= new ActionEvent(avatar, 0, null);
		//e.getSource() = principalView.getBtnConfiguration();
		c.actionPerformed(e);
		
	}
}
