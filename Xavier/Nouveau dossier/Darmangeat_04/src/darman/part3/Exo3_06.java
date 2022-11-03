package darman.part3;

import java.util.Scanner;

public class Exo3_06 {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);

		int age;
		System.out.println("Donnez l'age de l'enfant :  ");
		age = clavier.nextInt();

		if (age >= 6 && age <= 7) {

			System.out.println("Catégorie  \"Poussin\"  ");

		} else if (age >= 8 && age <= 9) {

			System.out.println("Catégorie  \"Pupille\"  ");

		} else if (age >= 10 && age <= 11) {

			System.out.println("Catégorie \"Minime\" ");
		} else if (age > 12) {

			System.out.println("Catégorie \"Cadet\"  ");
		}

	}

}
