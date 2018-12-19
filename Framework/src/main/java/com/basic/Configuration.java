package com.basic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentTest;

public class Configuration {

	public WebDriver driver=null;
	public ExtentTest logger=null;
	public Configuration()
	{
		System.setProperty("webdriver.chrome.driver", ReadPropertyFile.getProperty("ChromeDriverPath"));
		 driver=new ChromeDriver();
		 logger=ExtReport.startReport();
		driver.get(ReadPropertyFile.getProperty("ApplicationURL"));
		
	}
	
	
}
