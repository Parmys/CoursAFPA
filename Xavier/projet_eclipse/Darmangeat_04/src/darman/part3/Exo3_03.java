package darman.part3;
import java.util.Scanner;

public class Exo3_03 {

	public static void main(String[] args) {
		
		String nom1, nom2, nom3;
		
		Scanner clavier = new Scanner(System.in);

		System.out.println("Tappez le 1 nom : ");
		nom1 = clavier.nextLine();
		
		System.out.println("Tappez le 2 nom : ");
		nom2 = clavier.nextLine();
		
		System.out.println("Tappez le 3 nom : ");
		nom3 = clavier.nextLine();
		
		System.out.println(nom1.compareTo(nom2));
		System.out.println(nom1.compareTo(nom3));
		System.out.println(nom2.compareTo(nom3));
		
		
		//abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ
		//https://koor.fr/Java/Tutorial/java_system_out_printf.wp

	}

}
