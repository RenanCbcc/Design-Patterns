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
	
	public double pre�o_Sorvete(){
		return sorvete.pre�o_Sorvete()+Chocolate_pre�o();
	}
	
	public double Chocolate_pre�o(){
		return 0.50;
	}

}
