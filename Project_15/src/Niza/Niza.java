package Niza;
import java.util.Scanner;
public class Niza {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Vcitaj broj na clenovi vo nizata");
		int n = input.nextInt();
		int niza []= new int [n];
		System.out.println("Vcitaj clenovi vo nizata");
		for (int i =0; i< niza.length; i++) {
			System.out.print(i + "-->");
			niza [i]=input.nextInt();
		}
		double p=1;
		for(int i=0;i < niza.length;i++) {
			p=p*niza[i];
		}
		System.out.println("p="+p);
		}

	}


