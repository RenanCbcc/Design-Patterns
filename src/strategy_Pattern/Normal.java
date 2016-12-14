package strategy_Pattern;

public class Normal implements Palavra {
	
	public String render(String palavra)
	{
		return "<span>"+palavra+"</span>";
		
	}
}
