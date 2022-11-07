package eval.question;

public class Quest2_Multiple {

	public static void main(String[] args) {
		System.out.println(
				"*******************************************************************\n" +
						"Question 2\n" +
						"Ecrivez un programme  qui affiche les nombres entiers multiples\n" +
						" de 5 entre 1 et 20.\n" +
						"Documenter la classe de ce programme avec un commentaire javadoc et générez\n" +
						"la javadoc.\n" +
			
				"*******************************************************************\n\n\n");
		
		//début de la boucle avec un début a 1 et une fin a 20;
		for (int i = 1; i <= 20; i++) {
			// si le index modulo 5 = 0 alors afficher l'index qui est donc un entiers multiple
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}

	}

}
