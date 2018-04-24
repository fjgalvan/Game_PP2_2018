package serializable_data;

import java.io.IOException;
import java.io.Serializable;

public class Data implements Serializable{
	/**
	 *	Esta clase es Serializable porque implementa Serializable y todos sus
	 *  campos son Serializable 
	 */
	private static final long serialVersionUID = 1L;

	
	
	private void readObject(java.io.ObjectInputStream stream) throws IOException, ClassNotFoundException
	{
		   // Aqui debemos leer los bytes de stream y reconstruir el objeto
	}

	
	
	private void writeObject(java.io.ObjectOutputStream stream) throws IOException
	{
		   // Aquí escribimos en stream los bytes que queramos que se envien por red.
	}
}
