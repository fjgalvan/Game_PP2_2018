package claseProperties;
public class EleccionMenu {
	public String tecla_movimiento_arriba;
	public String tecla_movimiento_abajo;
	public String tecla_movimiento_izquierda;
	public String tecla_movimiento_derecha;
	public int personaje1_posX;
	public int personaje1_posY;
	public int personaje1_height;
	public int personaje1_width;
	public String personaje1_string_imagen;

	public EleccionMenu(String tecla_movimiento_arriba, String tecla_movimiento_abajo, String tecla_movimiento_izquierda,
			String tecla_movimiento_derecha, int personaje1_posX, int personaje1_posY, int personaje1_height, int personaje1_width,
			String personaje1_string_imagen) {
		this.tecla_movimiento_arriba= tecla_movimiento_arriba;
		this.tecla_movimiento_abajo= tecla_movimiento_abajo;
		this.tecla_movimiento_izquierda= tecla_movimiento_izquierda;
		this.tecla_movimiento_derecha= tecla_movimiento_derecha;
		this.personaje1_posX= personaje1_posX;
		this.personaje1_posY= personaje1_posY;
		this.personaje1_height= personaje1_height;
		this.personaje1_width= personaje1_width;
		this.personaje1_string_imagen= personaje1_string_imagen;
	}

	public String getTecla_movimiento_arriba() {
		return tecla_movimiento_arriba;
	}
	public void setTecla_movimiento_arriba(String tecla_movimiento_arriba) {
		this.tecla_movimiento_arriba = tecla_movimiento_arriba;
	}
	public String getTecla_movimiento_abajo() {
		return tecla_movimiento_abajo;
	}
	public void setTecla_movimiento_abajo(String tecla_movimiento_abajo) {
		this.tecla_movimiento_abajo = tecla_movimiento_abajo;
	}
	public String getTecla_movimiento_izquierda() {
		return tecla_movimiento_izquierda;
	}
	public void setTecla_movimiento_izquierda(String tecla_movimiento_izquierda) {
		this.tecla_movimiento_izquierda = tecla_movimiento_izquierda;
	}
	public String getTecla_movimiento_derecha() {
		return tecla_movimiento_derecha;
	}
	public void setTecla_movimiento_derecha(String tecla_movimiento_derecha) {
		this.tecla_movimiento_derecha = tecla_movimiento_derecha;
	}
	public int getPersonaje1_posX() {
		return personaje1_posX;
	}
	public void setPersonaje1_posX(int personaje1_posX) {
		this.personaje1_posX = personaje1_posX;
	}
	public int getPersonaje1_posY() {
		return personaje1_posY;
	}
	public void setPersonaje1_posY(int personaje1_posY) {
		this.personaje1_posY = personaje1_posY;
	}
	public int getPersonaje1_height() {
		return personaje1_height;
	}
	public void setPersonaje1_height(int personaje1_height) {
		this.personaje1_height = personaje1_height;
	}
	public int getPersonaje1_width() {
		return personaje1_width;
	}
	public void setPersonaje1_width(int personaje1_width) {
		this.personaje1_width = personaje1_width;
	}
	public String getPersonaje1_string_imagen() {
		return personaje1_string_imagen;
	}
	public void setPersonaje1_string_imagen(String personaje1_string_imagen) {
		this.personaje1_string_imagen = personaje1_string_imagen;
	}
	
}
