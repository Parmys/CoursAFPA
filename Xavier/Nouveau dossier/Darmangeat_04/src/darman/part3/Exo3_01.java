package darman.part3;
import java.util.Scanner;


public class Exo3_01 {

	public static void main(String[] args) {
		
		int x;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Tappez un entier : ");
		x = clavier.nextInt();
		
		if(x>0) {
			System.out.println("C'est un chiffre positif ");
			
		}else if(x<0) {
			
			System.out.println("C'est un chiffre négatif ");	
		}else {
			
			System.out.println("Autre cas ");	
		}
		
		

	}

}
