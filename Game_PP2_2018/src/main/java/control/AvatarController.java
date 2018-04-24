package control;

import model.Avatar;
import states.StateMove;

public class AvatarController {

	private Avatar avatar;
	private Teclado keyListener;
	private FactoryStateMove factory;
	
	public AvatarController(Avatar avatar) 
	{
		this.avatar = avatar;
	}
	
	public void controlAvatar() 
	{
		Integer keyPressedInNow = keyListener.getKeyPressed();
		if(keyPressedInNow != -1) 
		{
			StateMove stateMove = factory.getStateMove(keyPressedInNow);
			this.avatar.setStateMove(stateMove);
			this.avatar.doActionStateMove();
		}
	}
	
}
