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
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("intervalle[a,b], entrer a:");
		int a = scanner.nextInt();
		System.out.println("intervalle[a,b], entrer b:");
		int b = scanner.nextInt();
		System.out.println("intervalle[c,d], entrer c:");
		int c = scanner.nextInt();
		System.out.println("intervalle[c,d], entrer d:");
		int d = scanner.nextInt();

		if(b<c || d<a){
			System.out.println("ensemble vide");
		}else{
			int m = Integer.max(a,c);
			int M = Integer.min(b,d);
			System.out.println("["+m+";"+ M+"]");
		}
	}

}
