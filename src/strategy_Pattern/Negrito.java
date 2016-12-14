package strategy_Pattern;

public class Negrito implements Palavra {
	
	public String render(String palavra)
	{
			return "<b>"+palavra+"</b>";
		
	}

}
