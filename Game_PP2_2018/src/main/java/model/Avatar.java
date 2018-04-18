package model;

import java.awt.Point;

public class Avatar {

	private Point size; 
	private StateMoveTank stateMove;
	
	
	public Point getSize() {
		return size;
	}
	
	public StateMoveTank getStateMove() {
		return stateMove;
	}
	
	public void setStateMove(StateMoveTank stateMove) {
		this.stateMove = stateMove;
	}	

}
