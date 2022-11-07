package Items;

import java.util.Scanner;

public class Item_03 {

	public static void main(String[] args) {

		// variable
		int a, b, c;
		double delta, x1,x2;
		int x;

		// Saisie

		Scanner clavier = new Scanner(System.in);

		System.out.println("Saisissez un  a :  ");
		a = clavier.nextInt();

		System.out.println("Saisissez un  b :  ");
		b = clavier.nextInt();

		System.out.println("Saisissez un  c :  ");
		c = clavier.nextInt();

		System.out.println("Saisissez un  x :  ");
		x = clavier.nextInt();
  
		System.out.println("L'équation est :  " +"a*a + "+ "bx +" + "c "+" ="+0);
		
		
		
		
		delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println("delta est  :  " + delta);

		if (delta == 0) {
			
			x=-b/(2*a);
			
			System.out.println(" il y a UNE solution :  " + x);

		} else if (delta < 0) {
			
			System.out.println("Il n y a pas de solution ");

		} else if (delta > 0) {
			
			x1=(-b- Math.sqrt(delta)/(2*a));
			x2=(-b+Math.sqrt(delta)/(2*a));
			
			System.out.println("il y a DEUX solutions : " + "x1 : "+ x1 + " et  x2 : " + x2);
			
			

		}

	}

}
