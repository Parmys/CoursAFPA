import java.util.*;
import java.util.Scanner;

public class racineCarre{
	
	public  static void main(String [] args){
		
		Scanner clavier= new Scanner(System.in);
		System.out.println("Entrez le chiffre max : ");
		int nb = clavier.nextInt();
		
		for(int i=1; i<nb; i=i+1){
			
		System.out.println(i + "  " + (int)Math.pow(i,2) + "  " + (float)Math.sqrt(i));	
		
			
		}
	
	
	
}

}