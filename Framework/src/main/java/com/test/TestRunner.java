package com.test;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.basic.ExtReport;
import com.implementation.LogInPageImplementation;


public class TestRunner {

	@AfterTest
	public void afterTest()
		{
		ExtReport.closeReport();
	}
	@Test
	public void testRun()
	{
		
		LogInPageImplementation login=new LogInPageImplementation();
		login.pageImpl( "1","LogInPage");
		
		
	}
}
