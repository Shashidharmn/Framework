package com.basic;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class ExtReport {
	static ExtentReports extent;
	 static ExtentTest logger;
	 
	 public static ExtentTest startReport()
	 {
		 extent = new ExtentReports ("C:\\Users\\Shashi\\Desktop\\Report.html", true);
		 extent.loadConfig(new File("../Framework/Config.xml"));
		 logger = extent.startTest("passTest");
		 
		 return logger;
		
		
	 }
	 
	 public static void closeReport()
	 
	 { extent.endTest(logger);
	 extent.flush();
	 extent.close();
		 
	 }
}
