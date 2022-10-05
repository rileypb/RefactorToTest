import java.io.IOException;
import java.util.Random;

public class RockPaperScissors {

	private static String[] names = { "Rock", "Paper", "Scissors" };
	private static String[] verbs = { "breaks", "covers", "cuts" };

	public static void main(String[] args) throws IOException {
		int playerScore = 0;
		int computerScore = 0;
		Random rnd = new Random();

		while (playerScore < 5 && computerScore < 5) {
			int computerChoiceInt = rnd.nextInt(3);
			System.out.println("R, P, or S?");
			char playerChoiceChar = (char) System.in.read();
			playerChoiceChar = Character.toUpperCase(playerChoiceChar);
			int playerChoiceInt = -1;
			switch (playerChoiceChar) {
			case 'R':
				playerChoiceInt = 0;
				break;
			case 'P':
				playerChoiceInt = 1;
				break;
			case 'S':
				playerChoiceInt = 2;
				break;
			}
			
			if (playerChoiceInt == -1) {
				while (System.in.available() > 0) {
					System.in.read();
				}
				continue;
			}
			
			System.out.println("You played " + names[playerChoiceInt] + ", I played " + names[computerChoiceInt] + ".");
			
			int returnValue = 0;
			
			if (playerChoiceInt == computerChoiceInt) {
				System.out.println("A tie.");
			} else {
				boolean playerWins = (playerChoiceInt - computerChoiceInt == 1)
						|| (playerChoiceInt - computerChoiceInt == -2);
				int winner1;
				int loser;
				if (playerWins) {
					winner1 = playerChoiceInt;
					loser = computerChoiceInt;
				} else {
					winner1 = computerChoiceInt;
					loser = playerChoiceInt;
				}
			
				System.out.println(names[winner1] + " " + verbs[winner1] + " " + names[loser] + ".");
				if (playerWins) {
					System.out.println("You win!");
				} else {
					System.out.println("I win!");
				}
				returnValue = playerWins ? 1 : -1;
			}
			
			int winner = returnValue;
			
			if (winner == 1) {
				playerScore++;
			} else if (winner == -1) {
				computerScore++;
			}
			
			System.out.println("SCORE: You " + playerScore + ", Me " + computerScore);
			
			while (System.in.available() > 0) {
				System.in.read();
			}
		}

		System.out.println("FINAL SCORE: You " + playerScore + ", Me " + computerScore);

	}

}
