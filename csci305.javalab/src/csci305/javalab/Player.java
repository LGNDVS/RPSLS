package csci305.javalab;

public abstract class Player {

	public String name;
	
	Element paper = new Paper("Paper");
	Element rock = new Rock("Rock");
	Element scissors = new Paper("Scissors");
	Element spock = new Paper("Spock");
	Element lizard = new Paper("Lizard");
	
	Element[] allMoves = new Element[] {rock, paper, scissors, lizard, spock};
	
	Element lastPlay = null;
	
	public Player(String name) 
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public abstract Element play();
	
	
}
