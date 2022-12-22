package qa.util;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	Properties prop;
	
	public Properties init_properties() {
		prop = new Properties();
		
		try {
			FileInputStream file = new FileInputStream("./src/test/resources/Properties/config.properties");
			prop.load(file);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return prop;
	}
}
