package proje1;

import java.util.Scanner;

public class hesapMakinasi {

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
				System.out.println("İlk sayıyı giriniz:");
				a = veri.nextLine();
				sayi1 = Float.parseFloat(a);
				i=1;
				
			} catch (NumberFormatException e) {
				System.out.println("HATA! Sayı girmediniz.");
				
			}
		}
		
		i=0;
		while(i==0) {
			try {
				System.out.println("İkinci sayıyı giriniz:");
				a = veri.nextLine();
				sayi2 = Float.parseFloat(a);
				i=1;
				
			} catch (NumberFormatException e) {
				System.out.println("HATA! Sayı girmediniz.");
				
			}
		}

		sonuc = hesapMakinasi.toplama(sayi1, sayi2);
		System.out.println("Toplama işleminin sonucu:" + sonuc);
		
		sonuc = hesapMakinasi.cikartma(sayi1, sayi2);
		System.out.println("Çıkartma işleminin sonucu:" + sonuc);
		
		sonuc = hesapMakinasi.carpma(sayi1, sayi2);
		System.out.println("Çarpma işleminin sonucu:" + sonuc);
		
		sonuc = hesapMakinasi.bolme(sayi1, sayi2);
		System.out.println("Bölme işleminin sonucu:" + sonuc);
		
		sonuc = hesapMakinasi.modAlma(sayi1, sayi2);
		System.out.println("İlk sayının ikinci sayıya göre modu:" + sonuc);
		
		sonuc = hesapMakinasi.obeb(sayi1, sayi2);
		System.out.println("Girilen sayıların obebi:" + sonuc);
		
		sonuc = hesapMakinasi.okek(sayi1, sayi2);
		System.out.println("Girilen sayıların okeki:" + sonuc);

		veri.close();
		
	}
	
}
