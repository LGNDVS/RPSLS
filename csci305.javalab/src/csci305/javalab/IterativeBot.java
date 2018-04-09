package csci305.javalab;

public class IterativeBot extends Player {

	private int count;
	
	public IterativeBot(String name) {
		super(name);
		count = 0;
		
	}

	@Override
	public Element play() {
		if(count > 4) 
		{
			count = 0;
		}
		
		Element next = allMoves[count];
		count++;
		
		return next;
		
	}

}
