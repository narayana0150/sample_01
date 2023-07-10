package general_uility;

import java.io.FileInputStream;
import java.util.Properties;

public class Filee_utility {
	public String getproperties(String data) throws Throwable {
		FileInputStream fls=new FileInputStream("src/test/resources/flip.properties");
		Properties po=new Properties();
		po.load(fls);
		String value=po.getProperty(data);
		return value;
	}

}
