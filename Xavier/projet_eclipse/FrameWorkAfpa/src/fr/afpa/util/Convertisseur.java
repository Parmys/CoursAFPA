package fr.afpa.util;

import java.math.BigDecimal;
import static fr.afpa.math.Math.euroToDollar;
import static fr.afpa.math.Math.dollarToEuro;


import javax.swing.JOptionPane;

public class Convertisseur {

	public static void main(String[] args) {
		
		//// **********************************//////
		//////////// Swing JOption /////////////
		////// *******************************//////
		String saisie = JOptionPane.showInputDialog("Entrez un nombre : ");
		
		
	    BigDecimal valeur1 = new BigDecimal(saisie);
		
	    
	    euroToDollar(valeur1);
		JOptionPane.showMessageDialog(null,  euroToDollar(valeur1));
		
		
		//////////////////////////////////////////////////
		
		String saisie1 = JOptionPane.showInputDialog("Entrez un nombre : ");
		BigDecimal valeur2 = new BigDecimal(saisie1);
		valeur2 = new BigDecimal(saisie1);
		dollarToEuro(valeur2);
		JOptionPane.showMessageDialog(null,   dollarToEuro(valeur2));
	}

}

//https://stackabuse.com/java-check-if-string-is-a-number/