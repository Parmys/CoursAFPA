package eval.question;

import java.util.Scanner;

public class Quest5_Intervalle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 5\n" +
"Demander les deux intervalles [a ; b] et [c ; d]\n"+
"Si b < c ou bien a > d, l'intersection est vide\n"+
"Sinon, calculer deux variables : m (maximum de a et de c) et M (minimum de b et de d)\n"+
" et afficher l'intervalle [m; M]\n"+
"*******************************************************************\n\n\n"
		);
		
		
	
		int m, M;
		int  a, b, c,d;
		Scanner clavier= new Scanner(System.in);
		
		System.out.println("demander l'intervalle [a,b], entrer a : ");
		a =clavier.nextInt();
		
		System.out.println("demander l'intervalle [a,b], entrer b : ");
		b =clavier.nextInt();
		
		System.out.println("demander l'intervalle [c,d], entrer c : ");
		c =clavier.nextInt();
		
		System.out.println("demander l'intervalle [c,d], entrer d : ");
		d =clavier.nextInt();
		
		if(b<c || a>d) {
			System.out.println("L 'intersection entre les deux intervalles est vide ");
			
		}else {
			
			m=Math.max(a, c);
			M=Math.max(b, d);
			System.out.println("["+ m + ";"+ M+ "]");
		}
		
		
		
		clavier.close();

	}

}
