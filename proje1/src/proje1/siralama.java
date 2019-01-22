package proje1;

import java.util.Scanner;

public class siralama {

		public static void main(String args []) {
			
			int sayilar[] = new int[10];
			int i=0,j=0,yedek=0;
			
			Scanner veri = new Scanner(System.in);
			
			System.out.println("Sýralama yapmak için 10 adet tamsayý girilmelidir.");
			
			for(i=0;i<10;i++) {
				while(true) {
					try {
							System.out.println((i+1) + ". sayýyý giriniz:");
							sayilar[i] = Integer.parseInt(veri.nextLine());
							break;
						}
					 catch (Exception e) {
						System.out.println("Hata! Lütfen sadece tamsayý giriniz.");
					}
				}
			}
			
			for(i=0;i<10;i++) {
				for(j=0;j<10;j++) {
					if(sayilar[i]<sayilar[j]) {
						yedek = sayilar[i];
						sayilar[i] = sayilar[j];
						sayilar[j] = yedek;
					}
				}
			}
			
			for(i=0;i<10;i++) {
				System.out.print(sayilar[i] + "  ");
			}
			
			veri.close();
			
		}
}
