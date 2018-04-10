package csci305.javalab;

public class Paper extends Element {
	
	public Paper(String name) {
		super(name);	
	}

	@Override
	public String compareTo(Element ele) {
		Outcome outcome = new Outcome(this, ele);
		return outcome.rule + " -- " + outcome.result;
	}

	

}
