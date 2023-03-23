package com.kumaran;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger(MyClass.class);
		BasicConfigurator.configure();
		logger.info("This is my first log4j's statement");

	}

}
