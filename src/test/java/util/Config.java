package util;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class Config {

	public String trainurl,from,to,driverurl;
	static Properties prop = new Properties();
	
	public Config() {
		try {
			FileReader reader=new FileReader("testdata\\config.properties");  
			prop.load(reader);
			trainurl=prop.getProperty("trainurl");
			from = prop.getProperty("from");
			to = prop.getProperty("to");
			driverurl= prop.getProperty("driverurl");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
