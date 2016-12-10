package strategy_Pattern;

public class Italico implements Palavra {
	public String leia(String palavra)
	{
		if( palavra.endsWith("01"))
			return "<i>"+palavra.substring(0, palavra.length()-2)+"</i>";
		return palavra;
	}

}
