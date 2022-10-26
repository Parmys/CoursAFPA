package fr.afpa.math;
import java.util.Scanner;
import static java.lang.Math.*;

import java.math.BigDecimal;


/**
* @author 77011-05-10
* 
*   calcul de la factorielle par 3 méthodes : récursivité et par une boucle FOR et une boucle While
*  long n, l, f;
*  int cmp;
*  long fact;
*  char rep;
* 
* 
*/
public class Math {
	
			
	static Scanner clavier = new Scanner(System.in);
	

	////////////////////////////////////////////
	////////////// factorielle For////////////
	//////////////////////////////////////////

	public static long factorielleFor(long n) {
		
		long fact = 1;
		for (int i = 1; i <= n; i++) {

			fact = fact * i;
		}
		return fact;
	}

	////////////////////////////////////////////
	////////////// factorielle While////////////
	//////////////////////////////////////////

	 public static long factorielleWhile(long n) {
	
		long fact=1;

			do
			{
				
				if (n < 0) {
					System.out.println(" tappez un chiffre positif : ");
					 n = clavier.nextInt();
				}
		
			}while(n<0);
		//////////////////////////////////
			if(n==0)
			{
				System.out.println("factoriel est : " + 1);
			}else if(n==1)
			{
				System.out.println("factoriel est : " + 1);
		        fact=1;
			}
			//////////////////////////////////////
			while(n>=1) {
			
		
				fact = fact * n;
		
				// System.out.println("fact "+ fact);
				n = n - 1;
			}
			 return fact;
		     
	
}

	////////////////////////////////////////////
	////////////// factorielle recursive////////
	//////////////////////////////////////////
	public static long facto(long l) {
		
		
		if(l<0) {
			//return -1;
			throw new IllegalArgumentException("Pas de nombre négatif");
		}else if (l >= 1 && l<=20) {
			return l * facto(l - 1);
		} else if(l>20){
			//return -2;
			throw new IllegalArgumentException("Pas de nombre plus grand que 20");
		}else{
			
			return 1;
		}

	}
	
	
	
/////////////////////////////////////////////////////////	
		
		
		public static BigDecimal euroToDollar(BigDecimal euro) {
			
			 final  BigDecimal TAUX_EURO_DOLLAR= new BigDecimal("1.18674");
			 BigDecimal  dollar;
		
			dollar= euro.multiply(TAUX_EURO_DOLLAR) ;	
			
			return dollar;       
		}
	


}