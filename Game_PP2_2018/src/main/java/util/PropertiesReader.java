package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	private Properties properties; 
	private static String urlProperties = "src"+File.separator+"main"+File.separator+"resources"+File.separator+"configuration"+File.separator+"configuration.properties";
	
	public PropertiesReader() 
	{
		this.properties = new Properties();
		loadProperties();
	}
	
	private void loadProperties() 
	{
		try 
		{
			properties.load((new FileReader(urlProperties)));
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("No se encontro el archivo");
		} 
		catch (IOException e) 
		{
			System.out.println("Problema leyendo el archivo");
		}	
	}
	
	public DataConfigurationGame getParameterUrlBusquets() 
	{
		return new DataConfigurationGame(properties.getProperty("nameGame"), 
										 Integer.parseInt(properties.getProperty("width")), 
										 Integer.parseInt(properties.getProperty("heigth")));
	}
	
}

