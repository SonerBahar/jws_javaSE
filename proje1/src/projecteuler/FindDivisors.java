package projecteuler;

import java.util.Scanner;

public class FindDivisors {

	public static boolean isPrime(int number) {
		
		if(number==1) {
			return false;
		}else if(number==2) {
			return true;
		}else if(number%2==0) {
			return false;
		}
		
		boolean control=true;
		long limit = (long)Math.sqrt(number);
		
		
		for(long i=3;i<=limit;i=i+2) {
			if(number%i == 0) {
				control=false;
				break;
			}
		}
		return control;
	}
	
	public static void primeFactor(int number) {
		
		int i=0;
		int counter = 0;
		int limit = number;
		
		int primeList[] = new int[number];
		
		for(i=2;i<=limit;i++) {
			while(number%i == 0 ) {
				primeList[counter]=i;
				counter++;
				number=number/i;
			}
		}
	
		
		System.out.println("\nSayýnýn asal çarpanlarý:");
		for(i=0;i<limit;i++) {
			if(primeList[i]!=0) {
			System.out.print(primeList[i] + " ");
			}
		}
	}
	
	public static void dividers (int number) {
		
		int[] divideList = new int[number];
		int[] primelist = new int[number];
		int limit2 = (int)Math.sqrt(number);
		int limit = number;
		int counter = 0;
		int counter2 = 0;
		int yedek=0;
		int i=0;
		int j=0;
		
		
		for(i=1;i<=limit2;i++) {
			if(number%i == 0 ) {
				divideList[counter]=i;
				counter++;
				divideList[counter]=number/i;
				counter++;
				
			}
		}
		
		for(i=0;i<counter;i++) {
			for(j=0;j<counter;j++)
				if(divideList[i]<divideList[j]) {
					yedek=divideList[i];
					divideList[i]=divideList[j];
					divideList[j]=yedek;
				}
		}
	
		for(i=0;i<counter;i++) {
			if(isPrime(divideList[i])) {
				primelist[counter2] = divideList[i];
				counter2++;
			}
		}
		
		System.out.println("\nSayýnýn bütün bölenleri:");
		for(i=0;i<limit;i++) {
			if(divideList[i]!=0) {
			System.out.print(divideList[i] + " ");
			}
		}
		
		System.out.println("\nSayýnýn bütün bölenlerinden asal olanlar:");
		for(i=0;i<limit;i++) {
			if(primelist[i]!=0) {
			System.out.print(primelist[i] + " ");
			}
		}
		
	}
	
	public static void main(String Args[]) {
		
		int number=0;
		
		System.out.println("Asal çarpanlarýnýn bulunmasýný istediðiniz sayýyý giriniz:");
		
		Scanner data = new Scanner(System.in);
		number = data.nextInt();
		data.close();
		
		if(number<0) {
			number = number*(-1);
		}
		
		dividers(number);
		primeFactor(number);
		
		
	}
		
}
	
	
