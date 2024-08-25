package day39;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadingProperitesFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\config.properties");
		
		//Loading Properties file
		Properties properiteobj = new Properties();
		properiteobj.load(file);
		
		
		//Reading data from properties file
		String url= properiteobj.getProperty("appurl");
		String uname = properiteobj.getProperty("username");
		String pwd = properiteobj.getProperty("password");
		
		System.out.print(url +"\n"+ uname +"\n" + pwd);
		
		//Reading all the keys from properties file
		/*
		Set<String> keys=properiteobj.stringPropertyNames();
		System.out.println(keys);
*/
		Set<Object> keys= properiteobj.keySet();
		System.out.println(keys);
	}

}
