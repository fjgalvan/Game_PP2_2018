package modelo;

import model.SetDataCorner;

import org.junit.Test;

public class TestSetDataCorner {
	@Test
	public void testSetDataCorner(){
		SetDataCorner corner= new SetDataCorner(40,100, 40, 100);
		
		corner.getMaxHeight();
		corner.getMaxWidth();
		corner.getMinHeight();
		corner.getMinWidth();
	}
}
