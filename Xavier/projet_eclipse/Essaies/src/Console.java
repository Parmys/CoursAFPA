import java.util.Arrays;

//import java.io.Console;

public class Console {

		//public static void main(String[] args) {
		public static void main(String ... args) {  //ellipse dans main
		
			System.out.println("Number of Command Line Argument = "+args.length);
			//1 cas avec for
//			for(int i = 0; i< args.length; i++) {
//				//System.out.println(String.format("Command Line Argument %d is %s", i, args[i]));
//				//System.out.println("**** "+ i +" " + args[i]);
//				System.out.println( args[i]);
				
		//2 cas avec un tableau d'objet
			
			String  couleur[]= {"gris","rose","rouge","noir","blanc",};//objet comparable
			
			//String  couleur[]= {3,"rose",88,"noir","blanc",};//non comaparable
			
			for(int i = 0; i< couleur.length; i++) {
				
				String val=couleur[i];
			
			

	}
	
			Arrays.sort(couleur );
			System.out.println( Arrays.toString(couleur));

}
}