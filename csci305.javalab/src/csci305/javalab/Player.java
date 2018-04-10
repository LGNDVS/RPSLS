package csci305.javalab;

public abstract class Player {

	public String name;
	public Element lastMove;
	public Player opponent;
	
	//created an instance of each type of play possible, may be used throughout all subclasses
	Element paper = new Paper("Paper");
	Element rock = new Rock("Rock");
	Element scissors = new Paper("Scissors");
	Element spock = new Paper("Spock");
	Element lizard = new Paper("Lizard");
	
	//allMoves array to be called throughout all subclasses 
	Element[] allMoves = new Element[] {rock, paper, scissors, lizard, spock};
	
	//declaration of a new Element "lastPlay", will keep track of the players last move
	Element lastPlay = null;
	
	//Constructor to make a player with a given name
	public Player(String name) 
	{
		this.name = name;
	}
	
	//getName method of a Player
	public String getName() 
	{
		return name;
	}
	
	//abstract method play(), used by all types of players
	public abstract Element play();
	
	
	
	
}
