package csci305.javalab;

public class LastPlayBot extends Player {

	Element lastPlay = null;
	
	public LastPlayBot(String name) {
		super(name);
		
	}

	@Override
	public Element play() {
		
		if(lastPlay == null) 
		{
			lastPlay = paper;
		}
		
	}

}
