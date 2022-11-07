package Items;

import java.util.Scanner;

public class Item_02 {

	public static void main(String[] args) {

		// variable
		double x, y;
		int operande;
		double resultat;

		// lecture variable
		Scanner clavier = new Scanner(System.in);

		System.out.println("Saisissez un  x :  ");
		x = clavier.nextDouble();

		System.out.println("Saisissez x :  ");
		y = clavier.nextDouble();

		System.out.println("Saisissez operande : 1 ou 2 ou 3 ou 4  ");
		System.out.println("- 1- division");
		System.out.println(" -2- multiplication");
		System.out.println(" -3- soustraction");
		System.out.println(" -4- addition");

		operande = clavier.nextInt();

		if (operande == 1) {

			resultat = x / y;
			System.out.println("Resultat est :  " + resultat);

		} else if (operande == 2) {

			resultat = x * y;

			System.out.println("Resultat est :  " + resultat);
		} else if (operande == 3) {

			resultat = x - y;
			System.out.println("Resultat est :  " + resultat);
		} else if (operande == 4) {

			resultat = x + y;
			System.out.println("Resultat est :  " + resultat);

		}

	}
	
	

}
