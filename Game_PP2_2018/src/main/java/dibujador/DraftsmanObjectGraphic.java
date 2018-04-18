package dibujador;

import java.awt.Graphics;
import modelo.ObjectGraphic;

public class DraftsmanObjectGraphic {
	private ObjectGraphic objectGraphic;
	private Graphics graphic;

	public DraftsmanObjectGraphic(ObjectGraphic objectGraphic, Graphics g) {
		this.objectGraphic = objectGraphic;
		this.graphic = g;
	}

	public void drawObjectGraphic() {
		graphic.drawImage(objectGraphic.getImage(), (int) objectGraphic.getCoordinate().getX(),
				(int) objectGraphic.getCoordinate().getY(), (int) objectGraphic.getSize().getX(),
				(int) objectGraphic.getSize().getY(), null);
	}
}
