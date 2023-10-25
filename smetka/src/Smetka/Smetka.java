package Smetka;
import java.util.Scanner;
public class Smetka {
	
	public static void main (String []args ) {
		// jabolki - 50 den, krusi - 60 den, grozje - 100 den kg
		double smetka = 0;
		System.out.println("Vnesi sto si pazaruval vo kilogrami");
		Scanner tastatura= new Scanner(System .in);
		System.out.println("jaboklki");
		double jabolki = tastatura.nextDouble();
		System.out.println("krusi");
		double krusi = tastatura.nextDouble();
		System.out.println("krusi");
		double grozje = tastatura.nextDouble();
		System.out.println("grozje");
		smetka= jabolki*50+krusi*60+grozje*100;
		System.out.println("Smetkata iznesuva"+smetka+"denari");
	}
			
	}


