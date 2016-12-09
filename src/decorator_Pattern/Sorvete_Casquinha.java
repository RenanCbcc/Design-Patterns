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
	
	public double preço_Sorvete(){
		return sorvete.preço_Sorvete()+Casquinha_preço();
	}
	
	public double Casquinha_preço()
	{
		return 1.20;
	}
}
