package serializable_data;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import model.ObjectGraphic;

/**
 *	Esta clase es Serializable porque implementa Serializable y todos sus
 *  campos son Serializable 
 */
public class Data implements Serializable{
	
	ArrayList<ObjectGraphic> list= new ArrayList<ObjectGraphic>();
	
	private static final long serialVersionUID = 1L;
	
	public Data(ArrayList<ObjectGraphic> list)
	{
		this.list= list;
	}
	
	public void serializarArchivo()
	{
		try // Debe estar en un try/catch
		{
			FileOutputStream fos = new FileOutputStream("listaObjetosGraficos.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			for(int i=0; i< list.size(); i++)
			{
				out.writeObject(list.get(i));
			}
			out.close();
		}catch (Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	public void leerArchivo(){
		ArrayList<ObjectGraphic> list2= new ArrayList<ObjectGraphic>();
		try // Debe estar en un try/catch
		{
			FileInputStream fis = new FileInputStream("listaObjetosGraficos.txt");
			ObjectInputStream in = new ObjectInputStream(fis);
			for(int i=0; i< list.size(); i++)
			{
				list2=(ArrayList<ObjectGraphic>) in.readObject();
			}
			in.close();
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}
	
		
		
	/*private void readObject(java.io.ObjectInputStream stream) throws IOException, ClassNotFoundException
	{
		   // Aqui debemos leer los bytes de stream y reconstruir el objeto
	}*/

	
	
	/*private void writeObject(java.io.ObjectOutputStream stream) throws IOException
	{
		   // Aquí escribimos en stream los bytes que queramos que se envien por red.
	}*/
	
	
	/**
	 * Convertir un Serializable a byte[] y viceversa
	 * 
	 * De objeto a byte[]
	 * 
	 * ByteArrayOutputStream bs= new ByteArrayOutputStream();
	 * ObjectOutputStream os = new ObjectOutputStream (bs);
     * os.writeObject(unObjetoSerializable);  // this es de tipo DatoUdp
     * os.close();
     * byte[] bytes =  bs.toByteArray(); // devuelve byte[]
     * 
     * De byte[] a objeto
     * 
     * ByteArrayInputStream bs= new ByteArrayInputStream(bytes); // bytes es el byte[]
     * ObjectInputStream is = new ObjectInputStream(bs);
     * ClaseSerializable unObjetoSerializable = (ClaseSerializable)is.readObject();
     * is.close();
	 */
}
