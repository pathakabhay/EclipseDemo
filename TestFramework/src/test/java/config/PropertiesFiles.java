package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesFiles {
	
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");
	static String value=null;
	

	public String getProperties(String property) {
		
		try {
			FileInputStream input = new FileInputStream(projectPath + "/src/test/java/config/config.properties");
			prop.load(input);
			value = prop.getProperty(property);
			
		} catch (Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}
		return value;

	}

}
