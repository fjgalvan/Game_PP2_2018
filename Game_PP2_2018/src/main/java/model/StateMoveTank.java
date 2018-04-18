package model;


public abstract class StateMoveTank
{
	protected Avatar tank;

	public StateMoveTank(){}
	
	public StateMoveTank(Avatar tanque)
	{
		this.tank = tanque;
	}
	
	public void setTank(Avatar tank)
	{
		this.tank = tank;
	}
	
	public abstract boolean hayColision(GraphicObject obj);
	public abstract void control();
	public abstract Orientation getOrientacion();
	
}
