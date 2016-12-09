package decorator_Pattern;

public class Sorvete_Casquinha extends Decorator_Recipiente {
	
	public Sorvete_Casquinha(Sorvete sorvete)
	{
		super(sorvete);
	}
	
	public String fazer_Sorvete()
	{
		return sorvete.fazer_Sorvete() + add_Casquinha();
	}
	
	private String add_Casquinha()
	{
		return "Na Casquinha ";
	}
	
	public double pre�o_Sorvete(){
		return sorvete.pre�o_Sorvete()+Casquinha_pre�o();
	}
	
	public double Casquinha_pre�o()
	{
		return 1.20;
	}
}
