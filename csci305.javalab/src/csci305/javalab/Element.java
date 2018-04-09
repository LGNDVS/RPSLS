package csci305.javalab;

public abstract class Element {
	
	public String name;
	
	//Constructor Method
	public Element(String name) 
	{
		this.name = name; 
	} 
	
	//getName method that returns 
	public String getName() 
	{
		return name;
	}
	
	public abstract String compareTo(Element x);
	
	

}
