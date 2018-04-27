package map;

import java.util.ArrayList;
import main.Constants;
import model.ObjectGraphic;

public class BringDataOfTheStructure {
	private ArrayList<ObjectGraphic> objects;
	private MapTiled mapTiled;
	public String route= Constants.ROUTE_MAP_TANK03;
	
	public BringDataOfTheStructure() {
		objects = new ArrayList<>();
		mapTiled = new MapTiled(route);
		mapTiled.initialize();
	}

	public void fillList() {
		mapTiled.createStructures(objects);
	}

	public MapTiled getMapTiled() {
		return mapTiled;
	}

	public ArrayList<ObjectGraphic> getObjects() {
		return objects;
	}
	public void setObjects(ArrayList<ObjectGraphic> objects) {
		this.objects = objects;
	}
	public String getRoute() {
		return route;
	}

}
