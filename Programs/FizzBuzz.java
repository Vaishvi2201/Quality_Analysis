/* Aim: To print first name if number is divisible by 3
 * print last name if number is divisible by 5
 * print first name + last name if number is divisible by both 3 and 5
 * Created on:8-02-2021
 * Author:Vaishvi Patel
 */

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
	
		String first_name="Vaishvi";
		String last_name="Patel";
		String answer;
		Scanner keyboard= new Scanner(System.in);
		
		do {
				System.out.println("Enter an integer number");
				Scanner sc= new Scanner(System.in);
				int input= sc.nextInt();
		

					if(input%3==0 && input%5==0) {
						System.out.println(first_name+" "+last_name);
			
					}
		
		
					else if(input%5==0) {
						System.out.println(last_name);
					}
		
		
					else if(input%3==0) {
						System.out.println(first_name);
					}
		
					else {
						System.out.println("Number not divisible by 3 or 5");
					}
		
					System.out.println("Do you want to continue the game Y/N");
					answer=keyboard.next();
		}
			while(answer.equalsIgnoreCase("Y"));
		

	}

}
