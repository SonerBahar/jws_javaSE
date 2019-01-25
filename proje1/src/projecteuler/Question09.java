package projecteuler;

public class Question09 {

	/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
	  a2 + b2 = c2
	  For example, 32 + 42 = 9 + 16 = 25 = 52.
	  There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	  Find the product abc.
	 */
	
	
	public static void main(String args[]) {
		
		int a=1, b=1, c=1;
		long product = 1;
		
		for(c=1;c<1000;c++) {
			for(b=1;b<c;b++) {
				for(a=1;a<b;a++) {
					if((a*a)+(b*b)==(c*c) && a+b+c==1000) {
						System.out.println("a=" + a);
						System.out.println("b=" + b);
						System.out.println("c=" + c);
						product = a*b*c;
						break;
					}
				}
			}
		}
		
		System.out.println("Toplamlarý 1000 olan ve ilk ikisinin kareleri toplamý üçüncü sayýnýn karesine eþit olan üç sayýnýn çarpýmý: " + product);
	}
}
