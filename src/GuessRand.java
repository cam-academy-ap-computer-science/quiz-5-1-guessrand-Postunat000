import java.util.*;

public class GuessRand {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); // Instantiate a new Scanner 'console'
		Random r = new Random(); // Instantiate (create) a new Random() object 'r'
		
		int guess = 0;
		int rand = 0;
		
		boolean success = false;
		rand = r.nextInt(101) + 0; // Get a random number between 1-100
		while (success == false) { // loop until 'success' is true. 
			System.out.println("Your Guess: ? ");
			guess = console.nextInt(); // Get an integer from the user.
			success =  compare(guess, rand); // call 'compare()' method
		}
	}
	
	// Declare a method named 'compare()' that accepts two parameters 'guess' and 'rand' and returns
	// a boolean.
	public static boolean compare(int guess, int rand) {
		boolean got_it = false;
		if (guess == rand) {  // Fix if test
			System.out.println("You got it!");
			got_it = true;
		} else if (guess <= rand) {  // Fix if test
			System.out.println("No, it's Higher");
		} else {
			System.out.println("No, it's Lower");
		}
		return (boolean) got_it;
	}
}
