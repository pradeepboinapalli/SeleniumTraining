package com.environment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import com.constants.Constant;

public class ReadPropertiesFile {
	
	Properties properties=new Properties();
	Constant constant=new Constant();
	String browserType;
	
	public void environmentFileRead(){
		try {
			properties.load(new FileInputStream("C:/selenium/src/main/java/com/environment/browser.properties"));
			HashMap<String,String> environmentVariable=new HashMap<String,String>();
			environmentVariable.put("browser", properties.getProperty("browser"));
			constant.environmentVariable=environmentVariable;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
