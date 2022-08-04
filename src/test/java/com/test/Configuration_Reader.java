package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	
	public Configuration_Reader() throws Throwable{
		File f = new File("C:\\Users\\Prabu\\eclipse-workspace\\Maven_project\\src\\test\\java\\com\\test\\data.property");
		 
		FileInputStream fi = new FileInputStream(f);
		p = new Properties();
		p.load(fi);
	}
	
	public String getBrowser() {
		//TODO Auto-generated method stub
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String getUrl() {
		//TODO Auto-generated method stub
		String url = p.getProperty("url");
		return url;
		
	}

}
