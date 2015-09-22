package com.dom.driver;

import java.io.*;
import java.util.Properties;


public class Reader {
	
	private static Properties info;
	
	private static FileInputStream file;
	
	private final String Path = "/home/wolf/Документы/JavaP/jav2/config";
	
	private final String KeyURL = "URL";
	
	private final String KeyUserName = "user";
	
	private final String KeyPass = "pass";
	
	
	private String url;
	
	private String user;
	
	private String pass;
	
	public Reader(){		
		try {
			file = new FileInputStream(Path);
			info.load(file);
			this.url = info.getProperty(KeyURL);
			this.user = info.getProperty(KeyUserName);
			this.pass = info.getProperty(KeyPass);
			file.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}		
		
	}
	
	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPass() {
		return pass;
	}

	
}
