package main;

import java.awt.Point;
import java.util.ArrayList;

import model.Avatar;
import model.ObjectGraphic;

import org.junit.Test;

public class TestMain {
	@Test
	public void testMain() {
		ArrayList<ObjectGraphic> objects = new ArrayList<>();
		objects.add(new Avatar(new Point(40,40), new Point(40,40),null));
		Game juego = new Game(objects);
		juego.start();
	}
}
