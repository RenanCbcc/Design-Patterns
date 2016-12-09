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
	
	public double preço_Sorvete()
	{
		return sorvete.preço_Sorvete() + Caramelo_preço();
	}
	
	public double Caramelo_preço(){
		return 0.50;
	}
}
