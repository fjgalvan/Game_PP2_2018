package states;

import modelo.Avatar;

public abstract class StateMove
{
	protected Avatar tank;
	
	public StateMove()
	{
	}
	
	public abstract void control();
	
}
