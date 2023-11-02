package NedelliiviBroevi;
import java.util.Scanner;
public class Nizaso3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Da se najdat broevi sto nese dellivi so tri");
		System.out.println("Vnesi broj na clenovi vo nizata");
		int size = scanner.nextInt();
		int [] n = new int [size];
		for (int i = 0; i<size;i++) {
			n[i] = scanner.nextInt(); }
		for(int i=0; i< size; i++) {
			if(!(n[i]%3==0)){
				System.out.println("Brojot sto ne e deliv so 3 e:"+"n[i]"+" ");
}
}
}
}