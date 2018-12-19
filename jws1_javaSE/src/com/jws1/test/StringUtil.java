package com.jws1.test;

import java.math.BigInteger;

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
	/** 
	 *Author: Bahar
	 *Tarih:2018/12/19
	 *
	 **/
	
	//Dışardan verilen parameter(String) başındaki ve sonundaki boşlukları sil

	
	public String  deleteTheSpaces(String parameter)
	{
		//parameter = parameter.trim();
		int last = parameter.length();
		
		StringBuffer sub = new StringBuffer();
		
		sub.append(parameter);
		
		sub.deleteCharAt(0);
		sub.deleteCharAt(last);
		
		parameter.contentEquals(sub);
		
		return parameter;
	}

	
	
	
	//Dışarıdan verilen parameter(String) bit(010101)'leri tersine çevir
	
	public String reverse (String parameter)
	{
		String binary = new BigInteger(parameter.getBytes()).toString();
		
		int last = binary.length();
		
		char[] sub=binary.toCharArray();
		
		int i;
		for(i=0;i<=last;i++) {
			
			if(sub[i]==0) {
				sub[i]=1;
			}
			else sub[i]=0;
		}
		
		parameter = sub.toString();
		
		return parameter;
	}
	
	
	
	
	// Dışarıdanan girilen String değişkenin başındaki ve sonundaki karakteri sil
	
	public String deleteFirstAndLastCharacter(String parameter)
	{
		int last = parameter.length();
		
		StringBuffer sub = new StringBuffer();
		
		sub.append(parameter);
		
		sub.deleteCharAt(0);
		sub.deleteCharAt(last);
		
		parameter.contentEquals(sub);
		
		return parameter;
	}
	
	
	
	// ayraçlarla ayrılmış uzun bir string parçalarına aır
	 
	public String splitBySplitter (String parameter, String splitter)
	{
		parameter.split(splitter);
		
		return parameter;
	}
	

	
}
