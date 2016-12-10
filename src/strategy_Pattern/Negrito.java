package strategy_Pattern;

public class Negrito implements Palavra {
	public String leia(String palavra)
	{
		if( palavra.endsWith("10"))
			return "<b>"+palavra.substring(0, palavra.length()-2)+"</b>";
		return palavra;
	}

}
