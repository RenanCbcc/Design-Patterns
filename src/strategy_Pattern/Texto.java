package strategy_Pattern;

public class Texto {
	private Palavra palavra;
	
	public Texto(Palavra palavra)
	{
		this.palavra = palavra;
	}
	
	public String excuteRender(String palavra)
	{
		return this.palavra.render(palavra);
	}
	
	
}
