package Items;
import java.util.Scanner;


public class Item_01 {

	public static void main(String[] args) {
		
		//VARIABLES
		double  somme;
		//SAISIE
		double dollar;
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisissez une somme en euro :  ");
		somme = clavier.nextInt();
		//conversion
		dollar= 0.97*somme;
		
		System.out.println(" somme en euro convertie en dollar :  " + dollar);
		
		if (dollar< 1000) {
		
		System.out.println("Access to this "+" $ "+ dollar +"capital gains exemption is a cornerstone"
				+ "of succession planning in the owner-managed business environmemt."  );

	}else if(dollar >= 1000) {
		
		System.out.println("Access to this "+"$ "+ dollar +" k "+"capital gains exemption is a cornerstone"
				+ "of succession planning in the owner-managed business environmemt.");
		
	}else if(dollar >= 1000000) {
		
		System.out.println("The federal government has up"+" $ "+ dollar +" million "+" dollars to help"
				+ "the cattle industry adapt and prepare for the new regulations.");
	}

}

}
