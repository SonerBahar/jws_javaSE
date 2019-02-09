package projecteuler;

public class Question04 {

	/*
	 A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 Find the largest palindrome made from the product of two 3-digit numbers.
	 */
	
	public static void main(String Args[]) {
		
		int i=999, j=999;
		int polindromic, control=0, ilk=0, ikinci=0;
		int bir, on, yuz, bin , onBin, yuzBin; 
		
		for(i=999;i>=100;i--) {
						
			for(j=999;j>=100;j--) {
				
				polindromic = i*j;
				bir = polindromic%10;
				on = ((polindromic%100)-(polindromic%10))/10;
				yuz = ((polindromic%1000)-(polindromic%100))/100;
				bin = ((polindromic%10000)-(polindromic%1000))/1000;
				onBin = ((polindromic%100000)-(polindromic%10000))/10000;
				yuzBin = ((polindromic%1000000)-(polindromic%100000))/100000;
				
				if(polindromic>=100 && polindromic<1000) {
					if(bir==yuz) {
						System.out.print(i + " ");
						System.out.print(j + " ");
						System.out.print(polindromic + "\n");
						if(control<polindromic) {
							control=polindromic;
							ilk=i;
							ikinci=j;
						}
							
						break;
					}
				}
				
				if(polindromic>=1000 && polindromic<10000) {
					if(bir==bin && on==yuz) {
						System.out.print(i + " ");
						System.out.print(j + " ");
						System.out.print(polindromic + "\n");
						if(control<polindromic) {
							control=polindromic;
							ilk=i;
							ikinci=j;
						}
						break;
					}
				}
				
				if(polindromic>=10000 && polindromic<100000) {
					if(bir==onBin && on==bin) {
						System.out.print(i + " ");
						System.out.print(j + " ");
						System.out.print(polindromic + "\n");
						if(control<polindromic) {
							control = polindromic;
							ilk=i;
							ikinci=j;
						}
						break;
					}
				}
				
				if(polindromic>=100000) {
					if(bir==yuzBin && on==onBin && yuz==bin) {
						System.out.print(i + " ");
						System.out.print(j + " ");
						System.out.print(polindromic + "\n");
						if(control<polindromic) {
							control = polindromic;
							ilk=i;
							ikinci=j;
						}
						break;
					}
				}
					
			}
		}
		System.err.print(ilk + " ");
		System.err.print(ikinci + " ");
		System.err.print(control);
		
	}
	
	
}
