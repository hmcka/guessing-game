import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int secretNumber = 5;
		
		System.out.println("Welcome to our guessing game.");
		System.out.println("Pick a number between 1 and 10:");
		int guessNumber = input.nextInt();
		
		if(secretNumber==guessNumber) {
			System.out.println("You win!");
		} else {
			System.out.println("Sorry. You LOSE.");
		}
		
		input.close();

	}

}
