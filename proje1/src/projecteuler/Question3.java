package projecteuler;

public class Question3 {

	/*
	 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
	 * factor of the number 600851475143 ?
	 */

	public static void main(String Args[]) {

		long number = 600851475143L;
		long i = 0, j = 0, factor = 0, control = 0;

		for (i = 2; i < (number / 2); i++) {
			control = 0;
			if (number % i == 0) {
				for (j = 2; j < i; j++) {
					if (i % j == 0) {
						control = 1;
					}
				}
				if (control == 0) {
					factor = i;
					System.out.print(factor + "\n");
				}
			}
		}
	}

}
