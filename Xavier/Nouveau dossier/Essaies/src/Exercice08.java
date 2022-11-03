import java.util.Scanner;

public class Exercice08 {

	static final int maxCol = 8;
	static final int maxLigne = 10;
	static int bInf = 0;
	static int bSup = 0;
	static int nb = 0;
	static int x = 0;
	static char rep ;
	public static void main(String[] args) {
		
//		int bInf = 0;
//		int bSup = 0;
//		int nb = 0;
//		int x = 0;
//		char rep = 'o';

		visualiser();
		saisir();
		afficherMultiples();
		Obtenir();
	}
//////////////////////////////////////////////
/////////////// VISUALISER/////////////////////
//////////////////////////////////////////////
	public static void visualiser() {
	

		
		saisir();
		afficherMultiples();
		Obtenir();
		do {
			System.out.print("\n\n Voulez-vous continuez (O/N : )");

			rep = ((new Scanner(System.in)).nextLine()).charAt(0);

		} while (rep != 'o' && rep != 'O');
	}

//////////////////////////////////////////////
/////////////// SAISIR////////////////////////
//////////////////////////////////////////////
	public static void saisir() {

		System.out.println("\n Affichage des MULTIPLES");

// ---------SAISIR PARAMETRE
		System.out.print("\n\tNombres divisibles par : ");
		nb = (new Scanner(System.in)).nextInt();

		System.out.print("\t Limite inferieure   : ");
		bInf = (new Scanner(System.in)).nextInt();

		System.out.print("\t Limite superieure : ");
		bSup = (new Scanner(System.in)).nextInt();

		System.out.println("\nAffichage des multiples de " + nb + " entre " + bInf + " et " + bSup + "\n");

	}

	//////////////////////////////////////////////
	/////////////// AFFICHER MULTIPLES/////////////
	//////////////////////////////////////////////

	public static void afficherMultiples() {
//		int bInf = 0;
//		int bSup = 0;
//		int nb = 0;
//		int x = 0;

		//saisir();
		x = bInf;
		while (x <= bSup) {
			if (x % nb == 0) {
				System.out.println("\t(" + x++ + ")");

			} else {
				System.out.println("\t" + x++);
				if ((x - bInf) % maxCol == 0) {

					System.out.println(); // maxCol caracteres affiches
					if ((x - bInf) % (maxCol * maxLigne) == 0) {
						System.out.println("\n Appuyer sur ENTREE ..."); // maxLigne lignes affiches
						// Console.in.readChar();
						(new Scanner(System.in)).nextLine();
					}
				}

			}
		}
	}

//	//////////////////////////////////////////////
//	/////////////// SAISIR////////////////////////
//	//////////////////////////////////////////////
//	public  static void saisir(int bInf, int bSup, int nb) {
//
//		System.out.println("\n Affichage des MULTIPLES");
//
//		// ---------SAISIR PARAMETRE
//		System.out.print("\n\tNombres divisibles par : ");
//		nb = (new Scanner(System.in)).nextInt();
//
//		System.out.print("\t Limite inferieure   : ");
//		bInf = (new Scanner(System.in)).nextInt();
//
//		System.out.print("\t Limite superieure : ");
//		bSup = (new Scanner(System.in)).nextInt();
//
//		System.out.println("\nAffichage des multiples de " + nb + " entre " + bInf + " et " + bSup + "\n");
//
//	}
//	
	//////////////////////////////////////////////
	/////////////// Obtenir////////////////////////
	//////////////////////////////////////////////

	public static void Obtenir() {
		
		

		do {
			System.out.print("\n\n Voulez-vous continuez (O/N : )");

			rep = ((new Scanner(System.in)).nextLine()).charAt(0);

		} while (rep != 'o' && rep != 'O');

	}

}
