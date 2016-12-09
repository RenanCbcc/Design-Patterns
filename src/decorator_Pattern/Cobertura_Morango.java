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
	
	public double preço_Sorvete()
	{
		return sorvete.preço_Sorvete() + Morango_preço();
	}
	
	public double Morango_preço(){
		return 0.50;
	}

}
