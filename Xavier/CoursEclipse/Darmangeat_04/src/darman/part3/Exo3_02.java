package darman.part3;

import java.util.Scanner;

public class Exo3_02 {

	public static void main(String[] args) {
		
			
			int x,y;
			
			Scanner clavier = new Scanner(System.in);
			System.out.println("Tappez le 1 entier : ");
			x = clavier.nextInt();
			
			System.out.println("Tappez le 2 entier : ");
			y = clavier.nextInt();
			
			if(x>0  &&  y>0) {
				System.out.println("le produit sera positif ");
				
			}else if(x<0  &&  y>0) {
				
				System.out.println("le produit sera négatif ");	
			}else if(x>0  &&  y<0){
				
				System.out.println("le produit sera négatif ");	
			}

	}

}
