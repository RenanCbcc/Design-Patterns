package strategy_Pattern;

public class Normal implements Palavra {
	public String leia(String palavra)
	{
		if( palavra.endsWith("00"))
			return "<span"+palavra.substring(0, palavra.length()-2)+"</span>";
		return palavra;
	}
}
