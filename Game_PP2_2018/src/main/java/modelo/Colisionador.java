package modelo;

public class Colisionador {

	private MapValues mapValues;
	
	public Colisionador(MapValues mapValues)
	{
		this.mapValues = mapValues;
	}
	
	public boolean hasColision(ObjectGraphic obj1, ObjectGraphic obj2) 
	{
		// PARA CAMBIAR , este metodo tiene que ser suficiente para todas las colisiones. Ver si hay algun caso particular
		
		// izquierda
		boolean colisionIzq = obj1.getCoordinate().getX() == obj2.getCoordinate().getX() + obj2.getSize().getX()
				&& obj1.getCoordinate().getY() < obj2.getCoordinate().getY() + obj2.getSize().getY()
				&& obj1.getCoordinate().getY() + obj2.getSize().getY() > obj2.getCoordinate().getY();
		// derecha
		boolean colisionDer = obj1.getCoordinate().getX() + obj1.getSize().getX() == obj2.getCoordinate()
				.getX() && obj1.getCoordinate().getY() < obj2.getCoordinate().getY() + obj2.getSize().getY()
				&& obj1.getCoordinate().getY() + obj1.getSize().getY() > obj2.getCoordinate().getY();
		// arriba
		boolean colisionArr = obj1.getCoordinate().getY() == obj2.getCoordinate().getY()+ obj2.getSize().getY()
				&& obj1.getCoordinate().getX() < obj2.getCoordinate().getX() + obj2.getSize().getX()
				&& obj1.getCoordinate().getX() + obj1.getSize().getX() > obj2.getCoordinate().getX();
		// abajo
		boolean colisionAbj = obj1.getCoordinate().getY() + obj1.getSize().getY() == obj2.getCoordinate()
				.getY() && obj1.getCoordinate().getX() < obj2.getCoordinate().getX() + obj2.getSize().getX()
				&& obj1.getCoordinate().getX() + obj1.getSize().getX() > obj2.getCoordinate().getX();
		return (colisionIzq || colisionDer || colisionArr || colisionAbj);
		
	}
	
	public boolean hasColisionWithCorner(TypeCorner typeCorner, ObjectGraphic obj) 
	{
		return mapValues.getValueCorner(typeCorner) < obj.coordinate.getX();// ver como hacerlo generico
	}
	
}
