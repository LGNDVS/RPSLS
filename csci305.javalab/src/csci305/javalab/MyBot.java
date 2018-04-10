package csci305.javalab;

public class MyBot extends Player {

	Element[] repeatMoves = new Element[] {rock, rock, paper, paper, scissors, scissors, lizard, lizard, spock, spock};
	private int count;
	
	public MyBot(String name) {
		super(name);
	}

	@Override
	public Element play() {
		
		//resets count if it becomes greater than the size of the array
		if(count > repeatMoves.length) 
		{
			//reset the counter
			count = 0;
		}
		
		//take the move in the count position in the array and returns
		Element repeat = repeatMoves[count];
		count++;
		return repeat;
	
	}

	

}
