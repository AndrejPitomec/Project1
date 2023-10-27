package Krug;
import java.util.Scanner;
public class Krug {
	public static void main (System[]args) {
		System.out.println("vnesete radius");
		Scanner tastatura = new Scanner (System.in);
		double r,plostina, perimetar;
		r= tastatura.nextDouble();
		plostina=r*r*3.14;
		perimetar=2*r*3.14;
				System.out.println("Plostina iznesuva: "+ plostina +" a perimetarot e: "+perimetar);
		
	}

}
