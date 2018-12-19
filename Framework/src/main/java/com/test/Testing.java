package com.test;

import java.util.Map;

import com.data.ReadData;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ReadData read=new ReadData();
		Map m=ReadData.getTestData("Sheet2", "1");
		System.out.println(m);
	}

}
