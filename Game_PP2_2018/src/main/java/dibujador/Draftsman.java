package dibujador;

import java.awt.Graphics;
import java.util.*;
import modelo.ObjectGraphic;

public class Draftsman {
	private DraftsmanObjectGraphic draftsmanObjectGraphic;
	private List<ObjectGraphic> objectGraphics;
	private Graphics graphic;
	
	public Draftsman(List objectGraphics, Graphics graphic){
		this.objectGraphics = objectGraphics;
		this.graphic = graphic;
	}
	
	public void drawAllObjects(){
		for(int i=0; i < objectGraphics.size(); i++){
			draftsmanObjectGraphic = new DraftsmanObjectGraphic(objectGraphics.get(i), graphic);
		}
	}
}
