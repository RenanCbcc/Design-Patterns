package strategy_Pattern;

public class Sublinhado implements Palavra {
	
	public String render(String palavra)
	{
			return "<u>"+palavra+"</u>";
		
	}

}
