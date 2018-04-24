package states;

import model.Avatar;
import model.Colisionador;

public abstract class StateMove
{
	protected Colisionador colisionador;
	protected Avatar tank;
	
	public StateMove() {} 
	
	public abstract void control();
	
}
