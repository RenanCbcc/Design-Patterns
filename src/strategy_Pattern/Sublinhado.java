package strategy_Pattern;

public class Sublinhado implements Palavra {
	public String leia(String palavra)
	{
		if( palavra.endsWith("11"))
			return "<u>"+palavra.substring(0, palavra.length()-2)+"</u>";
		return palavra;
	}

}
