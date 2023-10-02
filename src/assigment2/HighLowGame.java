package assigment2;

import java.util.Scanner;
import java.util.Random;

public class HighLowGame {
	
	//This program is a High-Low Guessing Game
	 //Game will loop for 5 guesses
	 //Guesses outside the range do not count

	public static void main(String[] args) {
		//Create a Random Number object
		Random random = new Random();
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		//Declare variables
		int randomNumber = random.nextInt(100) + 1;
		int chances = 0;
		//Prompt input from user
		System.out.println("Pick a number between 1 and 100");
		
		//While loop conditions
		while (chances < 5) {
			//Assign user's input to a variable
			int guess = input.nextInt();
			//IF statement for user guesses the random number
			
			//IF statement if user guess outside the range
			if (guess < 1 || guess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again.\"");
			}
			//Else IF statement if ueser's guess is too high
			else if (guess > randomNumber && chances < 5) {
				System.out.println("Please pick a lower number");
				chances++;
			}
			//Else IF statement if user's guess is too low
			else if (guess < randomNumber && chances < 5)  {
				System.out.println("Please pick a higher number");
				chances++;
			}
			
			if (guess == randomNumber) {
				System.out.println("You won!");
				break;
			}
			//IF statement if user guesses 5 times
			if (chances == 5) { 
					System.out.println("You lose, the number to guess was: "+ randomNumber);
					break;
			}
			
		}
			
	 }
}
	

	
