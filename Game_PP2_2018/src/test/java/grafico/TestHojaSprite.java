package grafico;

import org.junit.Test;

public class TestHojaSprite {
	@Test
	public void testHojaSprite() {
		HojaSprite desierto = new HojaSprite("/texturas/desierto.png", 320, 320);
		desierto.getAncho();
	}
}
