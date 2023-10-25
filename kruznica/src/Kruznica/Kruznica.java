package Kruznica;
import java.util.Scanner;
public class Kruznica {
	
	public static void main(String[] args) {
		double p, l;
		double pi = 3.14;
		    System.out.println("Programata presmetuva plostina i perimetar  na kruznicata");
		Scanner tastatura = new Scanner (System.in);
		double r = tastatura.nextDouble();
		System.out.println("radius e"+r+"cm");
		System.out.println("pi e"+pi+"cm");
		System.out.println();
		p=r*r*pi;
		System.out.println("Plostina e" +p);
		l=2*r*pi;
		System.out.println("Perimetarot" +l);
		
		
	}
	

}
