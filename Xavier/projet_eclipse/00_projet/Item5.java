import  java.lang.Math;
import java.util.Scanner;
import java.util.Random;


public class  Item5{


		public static void main(String [] args){
			
			Scanner clavier= new Scanner(System.in);
			System.out.println("Entrez un chiffre pour les calculs scientifiques : ");
			double x = clavier.nextInt(); // base
			System.out.println("Entrez un chiffre entre 2 et 4 : ");
			double y = clavier.nextInt();  // pour l 'exposant et autres
			
			
			System.out.println(" le Logarithme de x : " + Math.log(x) );
			System.out.println(" le sinus de x  :" + Math.sin(x) );
			System.out.println(" le cosinus  de x :" + Math.cos(x) );
			System.out.println(" la racine carré de x : " + Math.sqrt(x) );
			System.out.println(" la puissance y de x : " + (int)(Math.pow(x,y)) );
			
			System.out.println();
			System.out.println();
			System.out.println();
			Random random = new Random();

			for(int i = 1; i <=5; i++) {
            int value = random.nextInt(1,10) ;
            System.out.println(" les nombres aléatoires entre 1 et 5 ---> " +value);
        }
			
			
					
		}
		
}

