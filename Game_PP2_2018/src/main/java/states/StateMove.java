package states;

import modelo.Avatar;
import modelo.Colisionador;

public abstract class StateMove
{
	protected Colisionador colisionador;
	protected Avatar tank;
	
	public StateMove() {} 
	
	public abstract void control();
	
}
