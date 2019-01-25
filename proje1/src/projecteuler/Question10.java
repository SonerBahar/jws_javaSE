package projecteuler;

import java.util.Scanner;

public class Question10 {
	/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	  Find the sum of all the primes below two million.
	*/
	
	
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
		
	public static void main(String args[]) {
		
		int number=0;
		long sum=0L;
		int i=2;
		
		System.out.println("Hangi sayýya kadar asal sayýlarýn toplamýný öðrenmek istiyorsunuz?");
		Scanner data = new Scanner(System.in);
		number = data.nextInt();
		data.close();
		
		for(i=2;i<number;i++) {
			if(isPrime(i)) {
				sum= sum + i;
			}
		}
		
		System.out.println(number + " sayýsýna kadar asal sayý toplamlarý: " + sum);
		
	}
}
