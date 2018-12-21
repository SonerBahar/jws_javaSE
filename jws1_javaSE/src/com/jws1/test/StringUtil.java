package com.jws1.test;

public class StringUtil {

	/**
	 * Author: Soner 2018.12.15
	 *
	 **/
	public boolean isNullorEmpty(String parameter) {

		if (null == parameter || parameter.isEmpty()) {
			return false;
		}
		return true;

	}

	/**
	 * Author: Bahar Tarih:2018/12/19
	 *
	 **/

	// Dışardan verilen parameter(String) başındaki ve sonundaki boşlukları sil

	public String deleteTheSpaces(String parameter) {
		// parameter = parameter.trim();

		int last = parameter.length();

		StringBuilder sub = new StringBuilder();

		sub.append(parameter);

		sub.deleteCharAt(0);
		sub.deleteCharAt(last - 2);

		return sub.toString();
	}

	// Dışarıdan verilen parameter(String) bit(010101)'leri tersine çevir

	public String reverse(String parameter) {

		char[] sub = parameter.toCharArray();

		for (int i = 0; i < parameter.length(); i++) {
			if (sub[i] == '0') {
				sub[i] = '1';
			} else
				sub[i] = '0';
		}
		String value = new String(sub);
		return value;
	}

	// Dışarıdanan girilen String değişkenin başındaki ve sonundaki karakteri sil

	public String deleteFirstAndLastCharacter(String parameter) {

		int last = parameter.length();

		StringBuilder sub = new StringBuilder();

		sub.append(parameter);

		sub.deleteCharAt(0);
		sub.deleteCharAt(last - 2);

		return sub.toString();
	}

	// ayraçlarla ayrılmış uzun bir string parçalarına aır

	public String[] splitBySplitter(String parameter, String splitter) {

		String[] value = parameter.split(splitter);

		return value;
	}

}
