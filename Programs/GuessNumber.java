


/* Aim: To take the user input and check it matches with the jvm input
 * Allow the user to take 10 trials if not done try again should be used
 * Created on:8-02-2021
 * Updated on:10-02-2021(version 2)add do while loop
 * Updated on:15-02-2021(version 3)boolean flag and add function
 * Author:Vaishvi Patel
 */
import java.util.*;

public class GuessNumber {

	public static void main(String[] args) {

		String new_game_answer;

		do {
			Random rn = new Random();
			int jvm_input = rn.nextInt(100 - 1 + 1) + 1;
			Scanner keyboard = new Scanner(System.in);

			boolean tries = Check_number(jvm_input);

			if (tries == true) {
				System.out.println("Your 10 trials are over.");
			}
			System.out.println("Do you want to continue the game Y/N");
			new_game_answer = keyboard.next();

		} while (new_game_answer.equalsIgnoreCase("Y"));

	}

	public static boolean Check_number(int jvm_input) {

		System.out.println("Enter two integer between 1 to 100 for guessing the correct number");
		System.out.println("The addition of two numbers should not be more than 100!!");
		boolean tries = false;
		for (int trial = 1; trial <= 10; trial++) {

			System.out.println("Enter number 1=");

			Scanner sc1 = new Scanner(System.in);
			int user_input1 = sc1.nextInt();

			System.out.println("Enter number 2=");
			Scanner sc2 = new Scanner(System.in);
			int user_input2 = sc2.nextInt();

			int user_input = user_input1 + user_input2;
			System.out.println("Sum=" + user_input);

			if (user_input > 100 || user_input <= 0) {
				System.out.println("Enter valid numbers so that sum is between 1 to 100!" + "try no  " + trial);
			} else if (user_input == jvm_input) {
				System.out.println("You guessed correct number" + " try no  " + trial);
				break;
			} else if (jvm_input > user_input) {
				System.out.println("The number is greater than what you guessed" + " try no " + trial);
			}

			else {
				System.out.println("The number is less than what you guessed" + " try no " + trial);
			}

			tries = true;
		}
		return tries;

	}

}
