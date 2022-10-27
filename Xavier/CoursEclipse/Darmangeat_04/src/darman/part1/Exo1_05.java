package darman.part1;
//  C'est l'exo n° 6 pas n°5
public class Exo1_05 {

	public static void main(String[] args) {
	int a,b, temp;
	
	System.out.println(" Avant permutation " );
	System.out.println( );
	System.out.println( );
	
	a=10;
	System.out.println(" La valeur de A : " + a );
	b=15;
	System.out.println(" (APRES : )La valeur de B : " + b );
	
	
	System.out.println(" Aprés permutation " );
	System.out.println( );
	System.out.println( );
	temp=a;
	a=b;
	b=temp;
	
	System.out.println(" La valeur de A : " + a );
	System.out.println(" La valeur de B : " + b );
	
	}

}
