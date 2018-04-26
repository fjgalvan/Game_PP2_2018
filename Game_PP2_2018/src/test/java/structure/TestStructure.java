package structure;

import java.awt.Point;
import java.awt.image.BufferedImage;

import main.Constants;
import model.Avatar;

import org.junit.Test;

import enums.StructureType;

public class TestStructure {
	@Test
	public void testStructure(){
		Point coordinate= new Point(100,100);
		Point size= new Point(40,40);
		BufferedImage imagen = new BufferedImage(Constants.WIDTH, Constants.HEIGHT,BufferedImage.TYPE_INT_RGB);;
		Avatar avatar= new Avatar(coordinate, size, imagen);
		TypeOfStructure typeOfStructure= new TypeOfStructure(StructureType.UNDESTROYABLE, false, false);
		typeOfStructure.getStructureType();
		typeOfStructure.setStructureType(StructureType.DESTROYABLE);
		typeOfStructure.isColisicionTank();
		typeOfStructure.isCollisicionBullet();
		typeOfStructure.setCollisicionBullet(false);
		typeOfStructure.setCollisicionTank(false);
	}
}
