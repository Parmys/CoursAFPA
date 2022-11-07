package Items;

import java.util.Scanner;

public class Item_04 {

	public static void main(String[] args) {

		// données
		int n;
		int premier;
		int res;
		boolean flag = true;

		// saisie

		/*
		 * Scanner clavier = new Scanner(System.in);
		 * System.out.println("Saisissez un nombre : ");
		 * 
		 * n = clavier.nextInt();
		 * 
		 * System.out.println(" n : " + n); for (int i = 2; i <= n / 2; i++) {
		 * 
		 * System.out.println(" n : " + n); res = n % i;
		 * 
		 * if (res == 0) {
		 * 
		 * flag = false;
		 * 
		 * break; }
		 * 
		 * }
		 * 
		 * if (flag) { System.out.println(" Premier  " + n); } else {
		 * 
		 * System.out.println(" NON Premier ----- " + n); }
		 */

		int debut  = 2;
		int fin=100;
		for (int nb = debut; nb <= fin; nb++) {

			int i = nb - 1;
			
			while ((i >= 2) && (nb % i != 0)) {
				i--;

				

				if (i == 1) {

					System.out.println(" Premier  " + nb);
				}

			}
			
		}
		System.out.println(" ------");
	}

}
