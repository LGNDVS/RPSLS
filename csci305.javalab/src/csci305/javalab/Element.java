package csci305.javalab;

public abstract class Element {
	
	//each Element will be given a unique name
	public String name;
	
	//Constructor Method for Elements
	public Element(String name) 
	{
		this.name = name; 
	} 
	
	//getName method that returns the name of an Element
	public String getName() 
	{
		return name;
	}
	
	//Abstract class that is given to all subclasses in order to compare types of elements
	public abstract String compareTo(Element x);
	
	

}
