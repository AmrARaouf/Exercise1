import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Hello ASE2015 - how are you now? :)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter your name: ");
		String userName = br.readLine();
		HelloUser user = new HelloUser(userName);
		user.greetUser();
	}

}
