package decorator_Pattern;

public class Cobertura_Caramelo extends SorveteDecorator {
	public Cobertura_Caramelo(Sorvete sorvete)
	{
		super(sorvete);
	}
	
	public String fazer_Sorvete()
	{
		return sorvete.fazer_Sorvete() + add_Caramelo();
	}
	
	private String add_Caramelo(){
		return "com cobertura de Caramelo";
	}
	
	public double pre�o_Sorvete()
	{
		return sorvete.pre�o_Sorvete() + Caramelo_pre�o();
	}
	
	public double Caramelo_pre�o(){
		return 0.50;
	}
}
