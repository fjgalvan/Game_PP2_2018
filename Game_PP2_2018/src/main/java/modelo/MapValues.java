package modelo;

import java.util.EnumMap;
import java.util.Map;

public class MapValues {

	private Map<TypeCorner,Integer> cornerValues;
	
	public MapValues(SetDataCorner setDataCorner) 
	{
		setMapCornerValues(setDataCorner);
	}


	private void setMapCornerValues(SetDataCorner setData) 
	{
		this.cornerValues = new EnumMap<>(TypeCorner.class);
		this.cornerValues.put(TypeCorner.MAXHEIGHT, setData.getMaxHeight());
		this.cornerValues.put(TypeCorner.MINHEIGHT, setData.getMinHeight());
		this.cornerValues.put(TypeCorner.MAXWIDHT, setData.getMaxWidth());
		this.cornerValues.put(TypeCorner.MINWIDTH, setData.getMinWidth());
	}
	
	public Integer getValueCorner(TypeCorner type) 
	{
		return cornerValues.get(type);
	}
	
}
