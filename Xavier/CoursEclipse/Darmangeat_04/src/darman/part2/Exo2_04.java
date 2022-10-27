package darman.part2;

import java.util.Scanner;

public class Exo2_04 {
	public static void main(String[] args) {

		String NomArticle;
		int nbrArticle;
		double TVA;
		double PrixHTT, PrixTotal, Prix;

		char rep;

		Scanner clavier = new Scanner(System.in);

		do {
			System.out.println("Donnez le nom de l'article : ");
			NomArticle = clavier.nextLine();

			System.out.println("Donnez le prix de l'article : ");
			Prix = clavier.nextDouble();

			System.out.println("Donnez le taux TVA de l'article : ");
			TVA = clavier.nextDouble();

			System.out.println("Donnez le prix HTT de l'article : ");
			PrixHTT = clavier.nextDouble();

			System.out.println("Donnez le nbrArticle : ");
			nbrArticle = clavier.nextInt();

			do {
				System.out.println("\nVoulez vous ajouter un autre article (TAPEZ o ou n ) : ");
				rep=clavier.next().charAt(0);
			} while (rep !='o' && rep !='n');

		} while (rep=='o');
		
		clavier.close();

		PrixTotal = nbrArticle * PrixHTT * (1+TVA);

		System.out.println("\nLe prix total : " + PrixTotal);
	}
}
