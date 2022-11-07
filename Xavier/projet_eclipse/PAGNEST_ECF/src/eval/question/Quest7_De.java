package eval.question;

import java.util.ArrayList;
import java.util.Arrays;

public class Quest7_De {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
				"*******************************************************************\n" +
						"Question 7\n" +
						"Lancer un dé ( valeur aléatoire de 1 à 6 ) 15 fois.\n" +
						"Afficher les sorties et  afficher le nombre de sorties du\n" +
						"chiffre 1, de 2, de 3, de 4, de 5 et de 6\n" +
						"*******************************************************************\n\n\n");
		int min = 1;
		int max = 6;
		int range = max - min + 1;
		int[] tab = new int[15];
		for (int index = 0; index <= 14; index++) {
			int f = (int) (Math.random() * range) + min;
			tab[index] = f;
			System.out.println(f);
		}

		int taille = tab.length;
		int tmp = 0;
		for (int i = 0; i < taille; i++) {
			for (int j = 1; j < (taille - i); j++) {
				if (tab[j - 1] > tab[j]) {

					tmp = tab[j - 1];
					tab[j - 1] = tab[j];
					tab[j] = tmp;
				}

			}
		}
		System.out.println(Arrays.toString(tab));

		ArrayList<Integer> nb1 = new ArrayList<Integer>();
		ArrayList<Integer> nb2 = new ArrayList<Integer>();
		ArrayList<Integer> nb3 = new ArrayList<Integer>();
		ArrayList<Integer> nb4 = new ArrayList<Integer>();
		ArrayList<Integer> nb5 = new ArrayList<Integer>();
		ArrayList<Integer> nb6 = new ArrayList<Integer>();
		for (int index = 0; index < tab.length; index++) {
			if (tab[index] == 1) {
				nb1.add(tab[index]);
			}
		}
		for (int index = 0; index < tab.length; index++) {
			if (tab[index] == 2) {
				nb2.add(tab[index]);
			}
		}
		for (int index = 0; index < tab.length; index++) {
			if (tab[index] == 3) {
				nb3.add(tab[index]);
			}
		}
		for (int index = 0; index < tab.length; index++) {
			if (tab[index] == 4) {
				nb4.add(tab[index]);
			}
		}
		for (int index = 0; index < tab.length; index++) {
			if (tab[index] == 5) {
				nb5.add(tab[index]);
			}
		}
		for (int index = 0; index < tab.length; index++) {
			if (tab[index] == 6) {
				nb6.add(tab[index]);
			}
		}

		System.out.println("il y'a au total " + nb1.size() + " le nombre 1");
		System.out.println("il y'a au total " + nb2.size() + " le nombre 2");
		System.out.println("il y'a au total " + nb3.size() + " le nombre 3");
		System.out.println("il y'a au total " + nb4.size() + " le nombre 4");
		System.out.println("il y'a au total " + nb5.size() + " le nombre 5");
		System.out.println("il y'a au total " + nb6.size() + " le nombre 6");
	}
}
