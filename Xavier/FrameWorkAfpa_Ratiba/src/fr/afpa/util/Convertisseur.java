package fr.afpa.util;

import java.math.BigDecimal;
import static fr.afpa.math.Math.euroToDollar;



import javax.swing.JOptionPane;

public class Convertisseur {

	public static void main(String[] args) {
		
		
		String saisie = JOptionPane.showInputDialog("Entrez un nombre : ");
	    
		
		 BigDecimal valeur1 = new BigDecimal(saisie);
		
		 euroToDollar(valeur1);
		
		//System.out.println( euroToDollar(valeur1));
		
		JOptionPane.showMessageDialog(null,  euroToDollar(valeur1));

	}

}