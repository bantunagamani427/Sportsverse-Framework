package com.Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	private static PropertyFile prop;
	
	public PropertyFile() {
		
	}
	public static PropertyFile getObjectPropfile() {
		return prop=new PropertyFile();
	}
	
	public String readDatafromPropfile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("../SportsVerseFramework/src/main/resources/Browser.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

	}

	


