package fr.afpa.util;
import static java.lang.Math.*;


import static fr.afpa.math.Math.facto;

import java.util.Scanner;

import javax.swing.JOptionPane;

import static fr.afpa.math.Math.factorielleFor;
import static fr.afpa.math.Math.factorielleWhile;
import static fr.afpa.math.Math.facto;



public class CalculFactor {
	
	static String saisie;
	static long factN;
	
	
	static long n, l, f;
	static int cmp;
	static long fact;
	static Scanner clavier;
	static  char rep;

	public static void main(String[] args) {
		
        ////////////////////////////////////////
		////////////   Scanner  /////////////////
		////////////////////////////////////////
		
		
//		Scanner clavier = new Scanner(System.in);
//		System.out.println(" tappez un chiffre positif : ");
//		n = clavier.nextInt();
//		
		
		//f = factorielleFor(n);
		//f = factorielleWhile(n);
		// f = facto(n);
		
		
		//System.out.println("factotiel de n " + "est " + f + "!");

		////////////////////////////////////////
		// System.out.println(factorielleWhile());
		///////////////////////////////////////
			

//		do {
//
//			f = facto(n);
//			System.out.println("recursive  " + f);
//			System.out.print("\n\n Voulez-vous continuez (O/N : )");
//
//			// rep = ((new Scanner(System.in)).next().charAt(0));
//			rep = ((new Scanner(System.in)).nextLine().charAt(0));
//
//		} while (rep != 'n' && rep != 'N');

		///////////////////////////////////////
		//////////// import static ////////////
		///////////////////////////////////////
		//System.out.println("import static : " + Math.facto(5));
		
		
		///*********************************************/////	
		
		
		
						//// **********************************//////
						//////////// Swing JOption /////////////
						////// *******************************//////

				
					
		saisie = null;

		do {
			
			saisie = JOptionPane.showInputDialog("Entrez un nombre : ");
					
						
			if (saisie != null) {
			
				try {
					n = Long.parseLong(saisie);//  si l'entree n est pas un nombre  
					
					  //factN = factorielleFor(n); // 1ER FONCTION
				      factN = facto(n); // 2  FONCTION
				      //factN = factorielleWhile(n); // 3 FONCTION
				      
				      //System.out.println("Resultat "+factN);

					
					if (factN < 0) {
						JOptionPane.showMessageDialog(null,
								"R??sultat impossible " + "pour ce nombre :  " + n + "code erreur : " + factN);
	
					} else {
	
						JOptionPane.showMessageDialog(null, n + " ! vaut " + factN);
	
					}
				 
				}catch(NumberFormatException  e) { //plus precis
				//e.getMessage();
				//	System.out.println(" Saisir un nombre ");
					JOptionPane.showMessageDialog(null, "Saisir un nombre");

				
				}		
				catch(IllegalArgumentException  e) {  //moins precis
				//e.getMessage();
					//System.out.println(e.getMessage());
				JOptionPane.showMessageDialog(null, e.getMessage());

				}
						      					
			}

		} while (saisie != null);
		
		
		
		
		

		//clavier.close();
		System.exit(0);
	

		
	 			
		

	

}

}
