package eval.question;

import java.util.Scanner;

public class Quest6_PrenomLongTri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("*******************************************************************\n" + "Question 6\n"
				+ "Demander 5 prénoms et les stocker dans un tableau.\n"
				+ "Les réafficher « triés » de telle sorte que le prénom le plus long\n" + "soit en premier etc.\n"
				+ "Par exemple avec Didier, Bernard, Christine, Ahn, Ali\n" + "Le programme affichera\n"
				+ "Christine, Bernard, Didier, Ahn, Ali\n"
				+ "*******************************************************************\n\n\n");

		Scanner clavier = new Scanner(System.in);
		String[] tab = new String[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("Entrez le prenom " + i + " : ");
			tab[i] = clavier.nextLine();

		}

		boolean flag = true;
		while (flag) {

			flag = false;
			for (int i = 0; i < (tab.length - 1); i++) {
				if (tab[i].length() < tab[i + 1].length()) {
					String tmp = tab[i];
					tab[i] = tab[i + 1];
					tab[i + 1] = tmp;

					flag = true;
				}

			}

		}
		
		System.out.println("Tableau trie decroissant : ");
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(tab[i]);
			
			if(i !=4) {
				System.out.println(", ");
			}
		}
		System.out.println();
		
		clavier.close();
	}

}
