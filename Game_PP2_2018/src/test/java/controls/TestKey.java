package controls;

import org.junit.Test;

public class TestKey {
	@Test
	public void testKey(){
		Key k= new Key();
		
		k.pressedKey();
		k.releasedKey();
		k.isPressed();
		k.getLastPress();	
	}
}
