package proje1;

import java.util.Scanner;

public class HesapMakinasi {

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

		sonuc = HesapMakinasi.toplama(sayi1, sayi2);
		System.out.println("Toplama işleminin sonucu:" + sonuc);
		
		sonuc = HesapMakinasi.cikartma(sayi1, sayi2);
		System.out.println("Çıkartma işleminin sonucu:" + sonuc);
		
		sonuc = HesapMakinasi.carpma(sayi1, sayi2);
		System.out.println("Çarpma işleminin sonucu:" + sonuc);
		
		sonuc = HesapMakinasi.bolme(sayi1, sayi2);
		System.out.println("Bölme işleminin sonucu:" + sonuc);
		
		sonuc = HesapMakinasi.modAlma(sayi1, sayi2);
		System.out.println("İlk sayının ikinci sayıya göre modu:" + sonuc);
		
		sonuc = HesapMakinasi.obeb(sayi1, sayi2);
		System.out.println("Girilen sayıların obebi:" + sonuc);
		
		sonuc = HesapMakinasi.okek(sayi1, sayi2);
		System.out.println("Girilen sayıların okeki:" + sonuc);

		veri.close();
		
	}
	
}
