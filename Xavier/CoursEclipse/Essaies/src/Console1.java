import java.io.IOException;
 ///ne fonctionne sur IDE

public class Console1 {

	public static void main(String[] args)throws IOException {
		// Using Console to input data from user
        String name = System.console().readLine();
 
        System.out.println("You entered string " + name);
	}

}
