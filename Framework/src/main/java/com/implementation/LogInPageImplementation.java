package com.implementation;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.basic.GenricFunctions;
import com.data.ReadData;



public class LogInPageImplementation extends GenricFunctions{
	
	
	
	@Override
	public void pageImpl(String testCaseName,String sheetName) {
		
		Map<String,String> elements=new HashMap<String,String>();
		Map<String,String> data=new HashMap<String,String>();
		
		elements=ReadData.getPageElements(sheetName);
		data=ReadData.getTestData(testCaseName,sheetName );
			
		
			set(elements.get("FirstName"),data.get("FirstName"));
			
			set(elements.get("LastName"),data.get("LastName"));
	}

}
