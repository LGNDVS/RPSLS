package csci305.javalab;

public class Spock extends Element {

	public Spock(String name) {
		super(name);
	}

	@Override
	public String compareTo(Element ele) {
		Outcome outcome = new Outcome(this, ele);
		return outcome.rule + " -- " + outcome.result;
	}


}
