package csci305.javalab;
import java.util.Scanner;

public class Driver {
	
	public static void main(String args[]) 
	{
		System.out.println("Welcome to the game of Rock, Paper, Scissors, Lizard, Spock!");
		System.out.println("Please select the type of players from the list below:");
		System.out.println("(1) : Stupid Bot");
		System.out.println("(2) : Random Bot");
		System.out.println("(3) : Iterative Bot");
		System.out.println("(4) : Last Play Bot");
		System.out.println("(5) : Human");
		System.out.println("(6) : Repeating Bot (MyBot)");
		
		Scanner reader = new Scanner(System.in);
		int userInput = reader.nextInt();
		
		System.out.print("Pick Player 1: ");
		Player P1 = pickPlayer(userInput);
		
		userInput = reader.nextInt();
		System.out.print("Pick Player 2: ");
		Player P2 = pickPlayer(userInput);
		
		System.out.println(P1.getName() + " vs " + P2.getName());
		
		P1.opponent = P2;
		P2.opponent = P1;
		
		int roundCount = 0;
		int p1Score = 0;
		int p2Score = 0;
		while(roundCount <= 5)
		{ 
			Element p1Move = P1.play();
			Element p2Move = P2.play();

			P1.lastMove = p1Move;
			P2.lastMove = p2Move;
			
			roundCount++;
		}
		
		
	}
		
	
	public static Player pickPlayer(int Input) {
		switch(Input) 
		{
		case 1: 
			Player stupidbot = new StupidBot("StupidBot");
			return stupidbot;

		case 2: 
			Player randombot = new RandomBot("RandomBot");
			return randombot;

		case 3:
			Player iterativebot = new IterativeBot("IterativeBot");
			return iterativebot;

		case 4: 
			Player lastplaybot = new LastPlayBot("LastPLayBot");
			return lastplaybot;

		case 5:
			Player human = new Human("Human");
			return human;

		case 6:
			Player mybot = new MyBot("MyBot");
			return mybot;

		default:
			System.out.println("Error. Please Try Again.");
			return null;

		}
	}
		
	
	
	
		//Player[] allPlayers = new Player[] {stupidbot, randombot, iterativebot, lastplaybot, human, mybot};
	
		//creating all types of elements
//		Element paper = new Paper("Paper");
//		Element rock = new Rock("Rock");
//		Element scissors = new Paper("Scissors");
//		Element spock = new Paper("Spock");
//		Element lizard = new Paper("Lizard");
		
		//Self-Check for element classes
//	    System.out.println(rock.compareTo(paper));
//	    System.out.println(paper.compareTo(rock));
//	    System.out.println(rock.compareTo(rock));
	    
		//Self-check for Random Bot 
//		Player testbot = new RandomBot("Jimmy");
//		System.out.println(testbot.play().getName());
		
		//Self-Check for MyBot
//		Player testbot = new MyBot("Jimmy");
//		System.out.println(testbot.play().getName());
//		System.out.println(testbot.play().getName());
//		System.out.println(testbot.play().getName());
//		System.out.println(testbot.play().getName());
//		System.out.println(testbot.play().getName());
//		System.out.println(testbot.play().getName());
//		System.out.println(testbot.play().getName());
//		System.out.println(testbot.play().getName());
//		System.out.println(testbot.play().getName());
//		System.out.println(testbot.play().getName());
//		System.out.println(testbot.play().getName());
//		System.out.println(testbot.play().getName());		
		//Self-Check for human player
//		Player testbot = new Human("Jimmy");
//		testbot.play();
		
		
	

}
