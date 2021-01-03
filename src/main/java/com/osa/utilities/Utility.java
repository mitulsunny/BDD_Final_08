package com.osa.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Utility {
	private static Logger log=Utility.getLog(Utility.class);
	//Example:
	//log.info("This will add as a log in your execution.log file under target directory");
	
	public static Logger getLog(Class clazz) {
		Logger log=Logger.getLogger(clazz);
		PropertyConfigurator.configure("src/test/resources/log4j.properties");
		return log;
		}

}
