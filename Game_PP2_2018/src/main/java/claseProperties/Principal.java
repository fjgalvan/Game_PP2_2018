package claseProperties;
import java.io.*;
import java.util.Properties;
import main.Constantes;

public class Principal {//Lee un archivo de propiedades desde una ruta especifica y se imprime en pantalla.
	public Principal(){}
	public EleccionMenu leerArchivo() {
		 try {
			  Properties propiedades = new Properties();/**Creamos un Objeto de tipo Properties*/
			  propiedades.load(new FileReader(Constantes.rutaProperties));  /**Cargamos el archivo desde la ruta especificada*/
			  String tecla_movimiento_arriba = propiedades.getProperty("tecla_movimiento_arriba");  /**Obtenemos los parametros definidos en el archivo*/
			  String tecla_movimiento_abajo = propiedades.getProperty("tecla_movimiento_abajo");
			  String tecla_movimiento_izquierda = propiedades.getProperty("tecla_movimiento_izquierda");
			  String tecla_movimiento_derecha = propiedades.getProperty("tecla_movimiento_derecha");
			  
		      int personaje1_posX = Integer.parseInt(propiedades.getProperty("personaje1_posX"));
		      int personaje1_posY = Integer.parseInt(propiedades.getProperty("personaje1_posY"));
		      int personaje1_height = Integer.parseInt(propiedades.getProperty("personaje1_height"));
		      int personaje1_width = Integer.parseInt(propiedades.getProperty("personaje1_width"));
		     
		      String personaje1_string_imagen = propiedades.getProperty("personaje1_string_imagen");
		      
		      return new EleccionMenu(tecla_movimiento_arriba, tecla_movimiento_abajo, tecla_movimiento_izquierda, tecla_movimiento_derecha, 
		    		  personaje1_posX, personaje1_posY, personaje1_height, personaje1_width, personaje1_string_imagen);   } 
		  catch (IOException e) {return null;} 
	 }
	 public boolean ModificarArchivo(EleccionMenu eleccion){
			try {
			  Properties propiedades = new Properties();/**Creamos un Objeto de tipo Properties*/
				propiedades.load(new FileReader("src/main/java/properties/archivo.properties"));/**Cargamos el archivo desde la ruta especificada*/				
				propiedades.setProperty("tecla_movimiento_arriba", eleccion.tecla_movimiento_arriba);
				propiedades.setProperty("tecla_movimiento_abajo", eleccion.tecla_movimiento_abajo);
				propiedades.setProperty("tecla_movimiento_izquierda", eleccion.tecla_movimiento_izquierda);
				propiedades.setProperty("tecla_movimiento_derecha", eleccion.tecla_movimiento_derecha);
				
				propiedades.setProperty("personaje1_posX", String.valueOf(eleccion.personaje1_posX));
				propiedades.setProperty("personaje1_posY", String.valueOf(eleccion.personaje1_posY));
				propiedades.setProperty("personaje1_height", String.valueOf(eleccion.personaje1_height));
				propiedades.setProperty("personaje1_width", String.valueOf(eleccion.personaje1_width));
				
				propiedades.setProperty("personaje1_string_imagen", eleccion.personaje1_string_imagen);
				
				System.out.println("Se modifico el archivo Properties");		
				FileOutputStream file = new FileOutputStream("src/main/java/properties/archivo.properties");//("C:/Users/Usuario/git/PP2_primera_iteracion/PP2_iteracion1/src/main/java/properties/archivo.properties");
				propiedades.store(file, "Escribiendo");			
				file.close();	
				return true;				
			} catch (IOException e) {System.out.println("Error, El archivo no exite o no se puede leer");return false;}
	 }
}