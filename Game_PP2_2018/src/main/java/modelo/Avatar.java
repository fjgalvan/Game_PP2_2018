package modelo;

import java.awt.Point;
import java.awt.image.BufferedImage;
import states.StateMove;

public class Avatar extends ObjectGraphic{

	private StateMove stateMove;
	
	public Avatar(Point coordinate, Point size, BufferedImage image) 
	{
		super(coordinate, size, image);
	}
	
	public void setStateMove(StateMove stateMove) 
	{
		this.stateMove = stateMove;
	}

	public void doActionStateMove() {
		this.stateMove.control();
	}
	
}
