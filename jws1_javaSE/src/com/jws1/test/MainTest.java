package com.jws1.test;

public class MainTest {

	public static void main(String[] args) {
		
		StringUtil util = new StringUtil();
			
		if(util.isNullorEmpty("jfodj")) {
			System.out.println("true");
		}

		String test = util.deleteFirstAndLastCharacter("aBaharA");
		 System.out.println(test);
		
		String test1 = util.deleteTheSpaces(" Bahar ");
		System.out.println(test1);
		
		String test2[] = util.splitBySplitter("Bahar/Soner","/");
		for (int i = 0; i < test2.length; i++) {
			System.out.println(test2[i]);
		}
		
		
		String test3 = util.reverse("1010101010100000100101");
		System.out.println(test3);
		
	}

}
