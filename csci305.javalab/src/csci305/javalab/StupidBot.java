package csci305.javalab;

public class StupidBot extends Player {

	public StupidBot(String name) {
		super(name);
		
	}

	@Override
	public Element play() 
	{
		
		//sets stupidBots only move to paper and returns
		Element turn = paper; 
		return turn; 
	}

	
}
