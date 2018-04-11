package csci305.javalab;
import java.util.Scanner;

public class Driver {
	
	public static void main(String args[]) 
	{
		//initial game prompt, choose what type of players will be in the game
		System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Logan Davis\n");
		System.out.println("Please choose two players: ");
		System.out.println("	(1) : Stupid Bot");
		System.out.println("	(2) : Random Bot");
		System.out.println("	(3) : Iterative Bot");
		System.out.println("	(4) : Last Play Bot");
		System.out.println("	(5) : Human");
		System.out.println("	(6) : MyBot\n");
		
		//new scanner declaration 
		Scanner reader = new Scanner(System.in);
		
		//declaration of the two players in the gamec
		Player P1 = null;
		Player P2 = null;
		
		//userInput initialized to 0 in order to enter while loop
		int userInput = 0;
		
		//while checking if the selection of player 1 is valid
		while(userInput < 1 || userInput > 6)
		{
			//Selection of type of player for player 2
			System.out.print("Select Player 1: ");
			userInput = reader.nextInt();
			P1 = pickPlayer(userInput);

			//if incorrect selection of player, will ask again
			if(userInput < 1 || userInput > 6) 
			{
				System.out.println("Invalid Player. Please try again.\n");
			}

		}

		//must reset userInput in order to check player 2's input
		userInput = 0;
		
		//while loop checking if player 2 has a valid input
		while(userInput < 1 || userInput > 6)
		{
			//Selection of the type of player for player2
			System.out.print("Select Player 2: ");
			userInput = reader.nextInt();
			P2 = pickPlayer(userInput);
			
			//if incorrect selection of player, will ask again
			if(userInput < 1 || userInput > 6)
			{
				System.out.println("Invalid Player. Please try again.\n");
			}

		}
		//Notify what players are in the match
		System.out.println("\n" + P1.getName() + " vs " + P2.getName() + ". Go!\n");
		
		//setting the players to be opponents of each other
		P1.opponent = P2;
		P2.opponent = P1;
		
		//starting round will be the 1st round
		int roundCount = 1;
		
		//Initialized each players score to 0
		int p1Score = 0;
		int p2Score = 0;
		
		//while loop to control each round until the 5th round is over
		while(roundCount <= 5)
		{ 
			//each player will select their move for the round
			Element p1Move = P1.play();
			System.out.println();
			Element p2Move = P2.play();
			System.out.println();
			
			//Prints out the current round
			System.out.println("Round " + roundCount + ":");
			
			//Prints out the move that each player made
			System.out.println("   Player 1 chose " + p1Move.getName());
			System.out.println("   Player 2 chose " + p2Move.getName());
			
			//setting the current move made to the variable lastMove for the lastMoveBot to work properly
			P1.lastMove = p1Move;
			P2.lastMove = p2Move;
			
			//setting roundResult to the string returned from the compareTo method
			String roundResult = p1Move.compareTo(p2Move);
			
			//setting endIndex to the first "-" in the string returned 
			int endIndex = roundResult.indexOf("-");	
			String subString;
			
			//prints out the result string of the compare to method
			if(endIndex != -1)
			{
				subString = roundResult.substring(0, endIndex);
				System.out.println("   " + subString);
			}
			
			
			//if roundResult contains the part "lose", p2 wins and p1 loses
			if(roundResult.contains("Lose")) 
			{
				System.out.println("   Player 2 won the round\n");
				p2Score++;
			}
			
			//if roundResult contains the part "win", p1 wins and p2 loses
			else if(roundResult.contains("Win")) 
			{
				System.out.println("   Player 1 won the round\n");
				p1Score++;
			}
			
			//if win or lose is not found in string, it was a tie
			else 
			{
				System.out.println("   Round was a tie\n");
			}
			
			roundCount++;
		}
		
		//prints out the current score of each player
		System.out.println("The score is " + p1Score + " to " + p2Score);
		
		//Conditional Statements to check who won the game in the end!
		if(p1Score > p2Score) 
		{
			System.out.println("Player 1 wins the game!");
		}
		else if(p2Score > p1Score) 
		{
			System.out.println("Player 2 wins the game!");
		}
		else
		{
			System.out.println("Game was a draw");
		}
			
	}
		
	
	//pickPlayer method to make a new instance of the player selected by the user at the start of the game
	public static Player pickPlayer(int Input) {

		switch(Input) 
		{
		case 1: 
			//if user chooses 1, make stupidBot
			Player stupidbot = new StupidBot("StupidBot");
			return stupidbot;

		case 2: 
			//if user chooses 2, make randomBot
			Player randombot = new RandomBot("RandomBot");
			return randombot;

		case 3:
			//if user chooses 3, make IterativeBot
			Player iterativebot = new IterativeBot("IterativeBot");
			return iterativebot;

		case 4: 
			//if user chooses 1, make LastPlayBot
			Player lastplaybot = new LastPlayBot("LastPlayBot");
			return lastplaybot;

		case 5:
			//if user chooses 5, make human player
			Player human = new Human("Human");
			return human;

		case 6:
			//if user chooses 6, make MyBot
			Player mybot = new MyBot("MyBot");
			return mybot;

		default:
			return null;

		}

	}
		
}
