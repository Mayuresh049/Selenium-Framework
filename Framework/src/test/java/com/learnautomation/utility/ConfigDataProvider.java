package com.learnautomation.utility;

import java.util.Properties;
import java.io.*;
public class ConfigDataProvider {
Properties pro;

public ConfigDataProvider() {
	
	File src=new File(".//Config//config.properties");
	FileInputStream fis;
	try {
		
		fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	}catch(Exception e) {
		System.out.println("Not able to load config file"+e.getMessage());
	}
}

public String getBrowser() {
	return pro.getProperty("Browser");
     }
public String getUrl()
   {
	return pro.getProperty("qaUrl");
	
   }
}
