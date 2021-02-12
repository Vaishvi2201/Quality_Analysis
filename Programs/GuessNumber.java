
/* Aim: To take the user input and check it matches with the jvm input
 * Allow the user to take 10 trials if not done try again should be used
 * Created on:8-02-2021
 * Author:Vaishvi Patel
 */
import java.util.*;

public class GuessNumber {

	public static void main(String[] args) {

		String answer;
				
			do {
				Random rn =new Random();
				int jvm_input=rn.nextInt(100);
				Scanner keyboard= new Scanner(System.in);

				System.out.println("Enter two integer between 0 to 100 for guessing the correct number");
				
				for(int i=1;i<=10;i++) {
					
						Scanner sc1= new Scanner(System.in);
						int user_input1= sc1.nextInt();
						
						Scanner sc2= new Scanner(System.in);
						int user_input2= sc2.nextInt();
						
						int user_input = user_input1 + user_input2;
						System.out.println("Sum=" +user_input);
						
						if(user_input==jvm_input) {
							System.out.println("You guessed correct number"+" try no "+i);
							break;
						}	
						else  if(jvm_input>user_input) {
							System.out.println("The number is greater than what you guessed"+" try no "+i);
						}
					
						else {
							System.out.println("The number is less than what you guessed"+" try no "+i);
							}	
			}
				System.out.println("10 trials are over");
					
					System.out.println("Do you want to continue the game Y/N");
					answer=keyboard.next();
					
				}
			
				while(answer.equalsIgnoreCase("Y"));			
	}

}
