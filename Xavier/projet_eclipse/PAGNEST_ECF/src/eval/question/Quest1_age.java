package eval.question;

import java.util.Scanner;

public class Quest1_age {

	public static void main(String[] args) {
		System.out.println(
				"*******************************************************************\n" +
						"Question 1\n" +
						"On veut savoir quand une mère aura le double de l'âge de son fils.\n" +
						"Lecture au clavier des 2 âges et présentation du résultat.\n" +
						"*******************************************************************\n\n\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("entrer l'age de la mère : ");
		int age = scanner.nextInt();
		System.out.println("entrer l'age du fils : ");
		int age2 = scanner.nextInt();
		scanner.close();
		int ageFils = age2;
		// while (age/2 != age2) {
		// age++;
		// age2++;
		// }
		int diff = age - age2;
		age += diff;
		age2 += diff;

		System.out.println(age + ageFils);
		System.out.println(age2);
	}

}
