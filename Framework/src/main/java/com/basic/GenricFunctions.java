package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.util.log.Log;

import com.relevantcodes.extentreports.LogStatus;


public abstract class GenricFunctions extends Configuration {

	public abstract void pageImpl(String testCaseName,String sheetName);
	
	public void set(String ele,String data)
	{
		driver.findElement(By.xpath("asas")).sendKeys(data);
		 logger.log(LogStatus.PASS, "Setting value "+data);
		 System.out.println("Setting value "+data);
	
	}
	public void click(String ele)
	{
		driver.findElement(By.xpath(ele)).click();
	}
	
	public void selectByValue(String ele,String data)
	{
		Select sel=new Select(driver.findElement(By.xpath(ele)));
		sel.selectByVisibleText(data);
	}
}
