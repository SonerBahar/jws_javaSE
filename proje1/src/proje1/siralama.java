package proje1;

import java.util.Scanner;

public class siralama {

		public static void main(String args []) {
			
			int sayilar[] = new int[10];
			int i=0,j=0,yedek=0;
			
			Scanner veri = new Scanner(System.in);
			
			System.out.println("S�ralama yapmak i�in 10 adet tamsay� girilmelidir.");
			
			for(i=0;i<10;i++) {
				while(true) {
					try {
							System.out.println((i+1) + ". say�y� giriniz:");
							sayilar[i] = Integer.parseInt(veri.nextLine());
							break;
						}
					 catch (Exception e) {
						System.out.println("Hata! L�tfen sadece tamsay� giriniz.");
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
