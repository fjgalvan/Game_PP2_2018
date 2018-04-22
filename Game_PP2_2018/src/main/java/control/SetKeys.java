package control;

public class SetKeys {

	private Integer keyUp;
	private Integer keyDown;
	private Integer keyLeft;
	private Integer keyRight;
	private Integer keyShoot;
	
	
	public SetKeys(Integer keyUp, Integer keyDown, Integer keyLeft, Integer keyRight, Integer keyShoot) {
		super();
		this.keyUp = keyUp;
		this.keyDown = keyDown;
		this.keyLeft = keyLeft;
		this.keyRight = keyRight;
		this.keyShoot = keyShoot;
	}


	public Integer getKeyUp() {
		return keyUp;
	}


	public Integer getKeyDown() {
		return keyDown;
	}


	public Integer getKeyLeft() {
		return keyLeft;
	}


	public Integer getKeyRight() {
		return keyRight;
	}


	public Integer getKeyShoot() {
		return keyShoot;
	}
	
}
