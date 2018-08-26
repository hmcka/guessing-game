import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int secretNumber = (int) Math.ceil(Math.random() * 10);
		int attempt = 0;
		
		System.out.println(secretNumber);

		System.out.println("Welcome to our guessing game.");
		System.out.println("Pick a number between 1 and 10:");
		int guessNumber = input.nextInt();
		attempt++;

		while (attempt < 3) {
			String result;
			if (secretNumber == guessNumber) {
				result = "You won!";
				attempt = 3;
				System.out.println("You won.");
			} else {
				result = "Try again";
				System.out.println("Pick a number between 1 and 10:");
				guessNumber = input.nextInt();
				attempt++;
				if (attempt == 3) {
					System.out.println("Game Over.");
				}
			}
			
			//System.out.println(result);
		}

		

		input.close();

	}

}
