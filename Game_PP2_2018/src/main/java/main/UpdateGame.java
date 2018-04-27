package main;

import java.awt.Point;
import java.util.ArrayList;

import control.AvatarController;
import model.Avatar;
import model.ObjectGraphic;
import util.LoadImage;

public class UpdateGame {
	private Avatar avatar;
	private AvatarController avatarController;
	private  ArrayList<ObjectGraphic> objects;
	
	public UpdateGame(){
		this.avatar = new Avatar(new Point (560, 520), new Point (40, 40), LoadImage.loadImageTranslated(Constants.ROUTE_IMAGE_TANKP1));
		this.avatarController = new AvatarController(avatar);
		objects = new ArrayList<>();
		objects.add(avatar);
	}
	
	public void actualizar(){
		//movimiento de tanque 
		//practicamente iria de todo y lo vamos desglozando en otras clases
	}

	public ArrayList<ObjectGraphic> getObjects() {
		return objects;
	}
	
}
