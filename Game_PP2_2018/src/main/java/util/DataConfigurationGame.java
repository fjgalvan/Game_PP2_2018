package util;

public class DataConfigurationGame {

	private String nameGame;
	private int width;
	private int heigth;
	
	public DataConfigurationGame(String nameGame, int width, int heigth) {
		super();
		this.nameGame = nameGame;
		this.width = width;
		this.heigth = heigth;
	}
	
	public String getNameGame() {
		return nameGame;
	}

	public void setNameGame(String nameGame) {
		this.nameGame = nameGame;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
}
