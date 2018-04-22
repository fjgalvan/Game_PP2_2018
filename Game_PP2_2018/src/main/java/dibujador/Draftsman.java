package dibujador;

import java.awt.Graphics;
import java.util.*;
import modelo.Avatar;
import modelo.ObjectGraphic;

public class Draftsman {
	private DraftsmanObjectGraphic draftsmanObjectGraphic;
	private List<ObjectGraphic> objectGraphics;
	private Graphics graphic;
	
	public Draftsman(List<ObjectGraphic> objectGraphics, Graphics graphic){
		this.objectGraphics = objectGraphics;
		this.graphic = graphic;
	}
	
	public void drawAllObjects(){
		for(int i=0; i < objectGraphics.size(); i++){
			draftsmanObjectGraphic = new DraftsmanObjectGraphic(objectGraphics.get(i), graphic);
		}
	}
	
	public void drawAvatarGame(Avatar avatar) 
	{
		new DraftsmanObjectGraphic(avatar,graphic);
	}
	
}
