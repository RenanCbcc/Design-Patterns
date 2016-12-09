package decorator_Pattern;

public class Cobertura_Chocolate extends SorveteDecorator {
	
	public Cobertura_Chocolate(Sorvete Sorvete_com_Cobertura)
	{
		super(Sorvete_com_Cobertura);
	}
	
	public String fazer_Sorvete()
	{
		return sorvete.fazer_Sorvete() + add_Chocolate();
	}
	
	
	private String add_Chocolate(){
		return "com cobertura de Chocolate";
	}
	
	public double preço_Sorvete(){
		return sorvete.preço_Sorvete()+Chocolate_preço();
	}
	
	public double Chocolate_preço(){
		return 0.50;
	}

}
