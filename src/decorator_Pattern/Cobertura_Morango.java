package decorator_Pattern;

public class Cobertura_Morango extends SorveteDecorator  {

	public Cobertura_Morango(Sorvete sorvete)
	{
		super(sorvete);
	}
	
	public String fazer_Sorvete()
	{
		return sorvete.fazer_Sorvete() + add_Morango();
	}
	
	private String add_Morango(){
		return "Com cobertura de Morango";
	}
	
	public double pre�o_Sorvete()
	{
		return sorvete.pre�o_Sorvete() + Morango_pre�o();
	}
	
	public double Morango_pre�o(){
		return 0.50;
	}

}
