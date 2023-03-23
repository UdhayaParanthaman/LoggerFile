package com.kumaran;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class LoggerSample {

	private static Logger logDemo=Logger.getLogger(LoggerSample.class);
	
	
	public static void main(String[] args) {
		
		String log4jPath=System.getProperty("user.dir") + File.separator + "/Log4j.properties";
		PropertyConfigurator.configure(log4jPath);
		
		
		
		System.out.println("This is Sysout");
		//disadvantage of sysout - will see only in console , if want to read in file means  will not possible
		logDemo.info("This is logger info");
		logDemo.debug("This is debug Error");
		logDemo.warn("DB Connection Failed");
		
//		
	}

}
