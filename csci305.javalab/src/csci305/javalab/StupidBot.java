package csci305.javalab;

public class StupidBot extends Player {

	public StupidBot(String name) {
		super(name);
		
	}

	@Override
	public Element play() 
	{
		
		Element turn = new Paper("Paper"); 
		lastPlay = paper;
		return turn; 
	}

	
}
