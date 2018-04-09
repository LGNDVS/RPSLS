package csci305.javalab;

public class Outcome {
	
	public String rule;
	public String result;
	
	//Outcome constructor to handle when LIZARD is first element
	public Outcome(Lizard lizard, Element ele) 
	{
		switch(ele.getName()) 
		{
			case "Rock":
				rule = "Rock crushes Lizard";
				result = "Lose";
				break;
				
			case "Paper":
				rule = "Lizard eats Paper";
				result = "Win";
				break;
			
			case "Scissors":
				rule = "Scissors decapitate Lizard";
				result = "Lose";
				break;
			
			case "Spock":
				rule = "Lizard poisons Spock";
				result = "Win";
				break;
				
			case "Lizard":
				rule = "Lizard equals Lizard";
				result = "Tie";
				break;
			
			default:
				rule = "Error " + lizard.getName();
				result = "Error " + ele.getName();
				
		}
	}
	
	//Outcome constructor to handle when SPOCK is first element
	public Outcome(Spock spock, Element ele) 
	{
		switch(ele.getName()) 
		{
			case "Rock":
				rule = "Spock Vaporizes Rock";
				result = "Win";
				break;
				
			case "Paper":
				rule = "Paper disproves Spock";
				result = "Lose";
				break;
			
			case "Scissors":
				rule = "Spock smashes Scissors";
				result = "Lose";
				break;
			
			case "Spock":
				rule = "Spock equals Spock";
				result = "Tie";
				break;
				
			case "Lizard":
				rule = "Lizard posions Spock";
				result = "Lose";
				break;
				
			default:
				rule = "Error " + spock.getName();
				result = "Error " + ele.getName();
				
		}
	}
	
	//Outcome constructor to handle when ROCK is first element
	public Outcome(Rock rock, Element ele) 
	{
		switch(ele.getName()) 
		{
			case "Rock":
				rule = "Rock equals Rock";
				result = "Tie";
				break;
				
			case "Paper":
				rule = "Paper covers Rock";
				result = "Lose";
				break;
			
			case "Scissors":
				rule = "Rock crushes Scissors";
				result = "Win";
				break;
			
			case "Spock":
				rule = "Spock vaporizes Rock";
				result = "Lose";
				break;
				
			case "Lizard":
				rule = "Rock crushes Lizard";
				result = "Win";
				break;
			
			default:
				rule = "Error " + rock.getName();
				result = "Error " + ele.getName();
				
		}
	}
	
	//Outcome constructor to handle when Paper is first element
	public Outcome(Paper paper, Element ele) 
	{
		switch(ele.getName()) 
		{
			case "Rock":
				rule = "Paper covers Rock";
				result = "Win";
				break;
				
			case "Paper":
				rule = "Paper equals Paper";
				result = "Tie";
				break;
			
			case "Scissors":
				rule = "Scissors cut Paper";
				result = "Lose";
				break;
			
			case "Spock":
				rule = "Paper disproves Spock";
				result = "Win";
				break;
				
			case "Lizard":
				rule = "Lizard posions Spock";
				result = "Lose";
				break;
				
			default:
				rule = "Error " + paper.getName();
				result = "Error " + ele.getName();
				
		}
	}
	
	//Outcome constructor to handle when Scissors is first element
	public Outcome(Scissors scissors, Element ele) 
	{
		switch(ele.getName()) 
		{
			case "Rock":
				rule = "Rock crushes Scissors";
				result = "Lose";
				break;
				
			case "Paper":
				rule = "Scissors cuts Paper";
				result = "Win";
				break;
			
			case "Scissors":
				rule = "Scissors equals Scissors";
				result = "Tie";
				break;
			
			case "Spock":
				rule = "Spock smashes Scissors";
				result = "Lose";
				break;
				
			case "Lizard":
				rule = "Lizards eats Paper";
				result = "Lose";
				break;
				
			default:
				rule = "Error " + scissors.getName();
				result = "Error " + ele.getName();
				
		}
	}
	
}
