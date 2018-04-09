package csci305.javalab;

public class MyBot extends Player {

	Element[] repeatMoves = new Element[] {rock, rock, paper, paper, scissors, scissors, lizard, lizard, spock, spock};
	private int count;
	
	public MyBot(String name) {
		super(name);
	}

	@Override
	public Element play() {
		
		if(count > 9) 
		{
			count = 0;
		}
		Element repeat = repeatMoves[count];
		count++;
		//lastPlay = repeatMoves[count];
		return repeat;
	
	}

	

}
