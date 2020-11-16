package automationTesting.XYZProject.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	
	public Properties getProperty(){
		FileReader fl = null;
		try {
			fl = new FileReader("application.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader reader=new BufferedReader(fl);
		Properties p=new Properties();
		try {
			p.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

}
