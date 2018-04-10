package csci305.javalab;


public class RandomBot extends Player {
	
	public RandomBot(String name) {
		super(name);
	}

	@Override
	public Element play() {
		
		//picks a random array index in the allMoves array and returns the move
		int random = (int)(Math.random() * allMoves.length);
		return allMoves[random];
		
	}

	

}
