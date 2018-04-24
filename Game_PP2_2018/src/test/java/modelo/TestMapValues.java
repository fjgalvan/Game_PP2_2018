package modelo;

import model.MapValues;
import model.SetDataCorner;
import model.TypeCorner;

import org.junit.Test;

public class TestMapValues {
	@Test
	public void testMapValues(){
		SetDataCorner setDataCorner= new SetDataCorner(40,100,40,100);
		
		MapValues map= new MapValues(setDataCorner);
		
		map.getValueCorner(TypeCorner.MAXHEIGHT);
	}
}
