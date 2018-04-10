package csci305.javalab;

public class Rock extends Element {

	public Rock(String name) {
		super(name);
	}

	@Override
	public String compareTo(Element ele) {
		Outcome outcome = new Outcome(this, ele);
		return outcome.rule + " -- " + outcome.result;
	}


}
