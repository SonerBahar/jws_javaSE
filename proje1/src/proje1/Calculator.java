package proje1;

import java.util.Scanner;

public class Calculator {

	public static float toplama(float a,float b) {
		
		return(a+b);
	}
	
	public static float cikartma(float a,float b) {
		
		return(a-b);
	}
	
	public static float carpma(float a,float b) {
		
		return(a*b);
	}
	
	public static float bolme(float a,float b) {
		
		return(a/b);
	}
	
	public static float modAlma(float a, float b) {
		
		return(a%b);
	}
	
	public static float obeb(float a, float b) {
		 float ebob=1;

	     for(int i = 1; i <= a && i <= b; ++i)
	     {
	    	 if(a % i == 0 && b % i == 0)
	    		 ebob = i;
	         }
	     return(ebob);
	}
	
	public static float okek(float a, float b) {
		
		return (a*b/obeb(a,b));
	}
	
	public static void main(String args []) {
	
		Scanner veri = new Scanner(System.in);
		float sayi1 = 0,sayi2 = 0 ,sonuc= 0;
		String a;
		int i=0;
		
		while(i==0) {
			try {
				System.out.println("Ýlk sayýyý giriniz:");
				a = veri.nextLine();
				sayi1 = Float.parseFloat(a);
				i=1;
				
			} catch (NumberFormatException e) {
				System.out.println("HATA! Sayý girmediniz.");
				
			}
		}
		
		i=0;
		while(i==0) {
			try {
				System.out.println("Ýkinci sayýyý giriniz:");
				a = veri.nextLine();
				sayi2 = Float.parseFloat(a);
				i=1;
				
			} catch (NumberFormatException e) {
				System.out.println("HATA! Sayý girmediniz.");
				
			}
		}

		sonuc = Calculator.toplama(sayi1, sayi2);
		System.out.println("Toplama iþleminin sonucu:" + sonuc);
		
		sonuc = Calculator.cikartma(sayi1, sayi2);
		System.out.println("Çýkartma iþleminin sonucu:" + sonuc);
		
		sonuc = Calculator.carpma(sayi1, sayi2);
		System.out.println("Çarpma iþleminin sonucu:" + sonuc);
		
		sonuc = Calculator.bolme(sayi1, sayi2);
		System.out.println("Bölme iþleminin sonucu:" + sonuc);
		
		sonuc = Calculator.modAlma(sayi1, sayi2);
		System.out.println("Ýlk sayýnýn ikinci sayýya göre modu:" + sonuc);
		
		sonuc = Calculator.obeb(sayi1, sayi2);
		System.out.println("Girilen sayýlarýn obebi:" + sonuc);
		
		sonuc = Calculator.okek(sayi1, sayi2);
		System.out.println("Girilen sayýlarýn okeki:" + sonuc);

		veri.close();
		
	}
	
}
