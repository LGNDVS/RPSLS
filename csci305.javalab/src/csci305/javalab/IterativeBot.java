package csci305.javalab;

public class IterativeBot extends Player {

	private int count;
	
	public IterativeBot(String name) {
		super(name);
		
		//each iterativeBot created, must start with a counter at 0
		count = 0;
	}

	@Override
	public Element play() {
		
		//checks if the count is greater than the allMoves Array
		if(count > 4) 
		{
			//reset the counter
			count = 0;
		}
		
		//next variable set to count position in the array
		Element next = allMoves[count];
		count++;
		return next;	
	}
}
