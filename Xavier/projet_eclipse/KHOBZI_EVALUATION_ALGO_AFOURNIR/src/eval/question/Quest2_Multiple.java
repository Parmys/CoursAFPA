package eval.question;

public class Quest2_Multiple {

	/**
	 * @param i : entier 
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 2\n" +
"Ecrivez un programme  qui affiche les nombres entiers multiples\n" +
" de 5 entre 1 et 20.\n" +
"Documenter la classe de ce programme avec un commentaire javadoc et générez\n"+
"la javadoc.\n"+
"*******************************************************************\n\n\n"
		);
		
		
		// C'est un programme qui affiche les multiple de 5 
		for(int i=0; i<=20;i++) {
			
			if(i%5==0) {
				
				System.out.println("C'est un multiple de 5 : " +i);
			}
			
		}
		
		

	}

}
