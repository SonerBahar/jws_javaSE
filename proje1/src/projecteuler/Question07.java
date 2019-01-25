package projecteuler;

public class Question07 {

	/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	  What is the 10 001st prime number?
	*/
	
	public static boolean isPrime(long number) {
		
		boolean control=true;
		long limit = (long)Math.sqrt(number);
		
		for(long i=2;i<=limit;i++) {
			if(number%i == 0) {
				control=false;
				break;
			}
		}
		return control;
	}
	
	public static void main(String Args[]) {
		
		long startTime = System.currentTimeMillis();
		int number = 1;
		int counter=0;
		int limit = 10001;
		
		while(counter<limit) {
			number ++;
		
			if(isPrime(number)) {
				counter ++;
			}
		}
		
		System.out.println(counter+". asal sayý "+ number+" sayýsýdýr.");
		
		long endTime = System.currentTimeMillis();
		
		System.out.println((endTime-startTime)/1000f);
		
	}
}
