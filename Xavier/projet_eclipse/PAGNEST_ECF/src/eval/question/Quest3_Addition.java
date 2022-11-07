package eval.question;

import java.util.ArrayList;
import java.util.Scanner;

public class Quest3_Addition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
				"*******************************************************************\n" +
						"Question 3\n" +
						"L'utilisateur saisit 5 nombres maximum.\n" +
						"Chaque nombre saisi est suivi de la touche [Entrée].\n" +
						"La saisie est terminée quand les 5 nombres sont saisis ou si on entre le nombre zéro.\n" +
						"Réafficher la liste des nombres saisis sous la forme d'une addition avec la somme de ses nombres.\n"
						+
						"( exemple: 8 + 9 + 2 + 1  = 20 )\n" +
						"*******************************************************************\n\n\n");

		ArrayList<Integer> tab = new ArrayList<Integer>();
		String textString = "";
		int i = 0;
		int nb;
		int somme = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("entrer un nombre :");
			nb = scanner.nextInt();
			if (nb != 0) {

				tab.add(nb);

			}
			i++;

		} while (nb != 0 && i < 5);

		for (int j = 0; j < tab.size(); j++) {

			if (j + 1 == tab.size()) {
				somme += tab.get(j);
				textString += tab.get(j) + " = " + somme;
			} else {

				textString += tab.get(j) + " + ";
				somme += tab.get(j);
			}

		}

		System.out.println(textString);
	}

}
