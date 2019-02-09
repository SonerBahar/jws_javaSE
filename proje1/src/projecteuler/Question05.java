package projecteuler;

public class Question05 {

	/* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	   What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	*/
	
	public static void main(String args[]) {
		
		long i;
		long number = (19*17*13*11*7*5*3*2); 
		int control = 0;
		
		while(true) {
			for(i=1;i<20;i++) {
				if(number%i != 0) {
					control = 1;
				}
			}
			if(control == 0) {
				break;
			}
			number = number + (19*17*13*11*7*5*3*2);
			System.out.println(number);
			control=0;
		}
		System.err.println(number); 
			
			
	}
}
