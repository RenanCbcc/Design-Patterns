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
	
	public double pre�o_Sorvete(){
		return sorvete.pre�o_Sorvete()+Copinho_pre�o();
	}
	
	public double Copinho_pre�o()
	{
		return 0.50;
	}
}
