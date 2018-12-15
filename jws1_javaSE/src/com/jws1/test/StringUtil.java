package com.jws1.test;

public class StringUtil {

	/** 
	 *Author: Soner
	 *2018.12.15
	 *
	 **/
	public boolean isNullorEmpty(String parameter)
	{
		
		if(null==parameter || parameter.isEmpty())
		{
			return false;
		}
		return true;
		
	}
}
