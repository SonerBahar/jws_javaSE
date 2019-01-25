package projecteuler;

public class Question06 {

	/* The sum of the squares of the first ten natural numbers is,
	   1^2 + 2^2 + ... + 10^2 = 385
	   The square of the sum of the first ten natural numbers is,
	   (1 + 2 + ... + 10)^2 = 55^2 = 3025
	   Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
	   Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	*/
	
	public static void main(String Args[]) {
		
		long i;
		long karelerToplami=0L;
		long parantezKarelerToplami=0L;
		
		for(i=1;i<=100;i++) {
			karelerToplami = karelerToplami + (i*i);
		}
		
		for(i=1;i<=100;i++) {
			parantezKarelerToplami = parantezKarelerToplami + i;
		}
		
		parantezKarelerToplami = parantezKarelerToplami * parantezKarelerToplami;
		
		System.err.print(parantezKarelerToplami-karelerToplami);
		
	}
	
}
