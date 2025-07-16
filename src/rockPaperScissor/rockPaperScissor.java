package rockPaperScissor;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissor {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] choices = {"rock", "paper", "scissors"};
		
		String playerChoice;
		String computerChoice;
		String playAgain = "yes";
		String againChoice;
		
		while (playAgain.equals("yes")) {
			
			System.out.print("Enter your move: ");
			playerChoice = scanner.nextLine().toLowerCase();
			
			if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
				System.out.println("Invalid choice!");
			}
			
			computerChoice = choices[random.nextInt(3)];
			System.out.println("Computers choice: " + computerChoice);
			
			if(playerChoice.equals(computerChoice)) {
				System.out.println("Its a tie!");
			}
			else if(playerChoice.equals("rock") && computerChoice.equals("scissors") ||
					playerChoice.equals("paper") && computerChoice.equals("rock") ||
					playerChoice.equals("scissors") && computerChoice.equals("paper")) {
				System.out.println("You win!");
			}
			else {
				System.out.println("You loose!");
			}
			
			System.out.print("Play Again? ");
			againChoice = scanner.nextLine();
			
			if (againChoice.equals("yes")) {
				playAgain = "yes";
			}
			else {
				playAgain  = "no";
				System.out.println("Thank you for playing this game!");
			}
		}
		
		
		
		scanner.close();
	}
}
