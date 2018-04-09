package csci305.javalab;
import java.util.Scanner;

public class Human extends Player {

	public Human(String name) {
		super(name);
		
	}

	@Override
	public Element play() {
		Scanner reader = new Scanner(System.in);
		int userInput = 0;
		
		while(userInput < 1|| userInput > 5) 
		{
			System.out.println("(1) : Rock");
			System.out.println("(2) : Paper");
			System.out.println("(3) : Scissors");
			System.out.println("(4) : Lizard");
			System.out.println("(5) : Spock");
			System.out.println("Enter your move: ");
			userInput = reader.nextInt();
		
			if(userInput < 1 || userInput > 5) 
			{
				System.out.println("Invalid move. Please try again.");
			
			}
		}
		
		Element turn = allMoves[userInput - 1];
		
		
		return turn;
	}
}
