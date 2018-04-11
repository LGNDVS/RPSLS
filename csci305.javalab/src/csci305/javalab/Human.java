package csci305.javalab;
import java.util.Scanner;

public class Human extends Player {
	Scanner reader = new Scanner(System.in);

	//Constructor to make human players
	public Human(String name) {
		super(name);
		
	}

	@Override
	public Element play() {
		
		//scanner initialization 
		
		//must set userInput to 0 when declared in order to enter while loop
		int userInput = 0;
		
		//ask type of move to make 
		while(userInput < 1|| userInput > 5) 
		{
			System.out.println("(1) : Rock");
			System.out.println("(2) : Paper");
			System.out.println("(3) : Scissors");
			System.out.println("(4) : Lizard");
			System.out.println("(5) : Spock");
			System.out.print("Enter your move: ");
			
			
			//capture the users decision 
			userInput = reader.nextInt();
		
			//error check if user does not enter valid move
			if(userInput < 1 || userInput > 5) 
			{
				System.out.println("Invalid move. Please try again.");
			
			}
		}
		
		//set the variable turn to the array location of a move in the array allMoves
		Element turn = allMoves[(userInput - 1)];
		return turn;
	}
}
