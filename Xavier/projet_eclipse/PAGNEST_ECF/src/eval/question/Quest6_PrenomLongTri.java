package eval.question;

import java.util.Arrays;
import java.util.Scanner;

public class Quest6_PrenomLongTri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 6\n" +
"Demander 5 prénoms et les stocker dans un tableau.\n" +
"Les réafficher « triés » de telle sorte que le prénom le plus long\n" +
"soit en premier etc.\n" +
"Par exemple avec Didier, Bernard, Christine, Ahn, Ali\n" +
"Le programme affichera\n" +
"Christine, Bernard, Didier, Ahn, Ali\n" +
"*******************************************************************\n\n\n"
		);
		
		String [] noms = new String [4];
		Scanner scanner = new Scanner(System.in);
		for (int index = 0; index < noms.length; index++) {
			System.out.println("entrer le nom numéro "+ index+  " :");
			noms[index] = scanner.nextLine();
		}
		scanner.close();
		
		System.out.println(Arrays.toString(noms));
		int taille = noms.length;  
		String tmp = "";  
		for(int i=0; i < taille; i++) 
		{
				for(int j=1; j < (taille-i); j++)
				{  
						if(noms[j-1].length() < noms[j].length())
						{
								
								tmp = noms[j-1];  
								noms[j-1] = noms[j];  
								noms[j] = tmp;  
						}
 
				}
		}
		System.out.println(Arrays.toString(noms));
	}

}
