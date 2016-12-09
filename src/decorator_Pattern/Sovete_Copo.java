package decorator_Pattern;

public class Sovete_Copo extends Decorator_Recipiente  {
	
	public Sovete_Copo(Sorvete sorvete)
	{
		super(sorvete);
	}
	
	public String fazer_Sorvete()
	{
		return sorvete.fazer_Sorvete() + add_Copinho();
	}
	
	private String add_Copinho()
	{
		return "No copinho ";
	}
	
	public double preço_Sorvete(){
		return sorvete.preço_Sorvete()+Copinho_preço();
	}
	
	public double Copinho_preço()
	{
		return 0.50;
	}
}
