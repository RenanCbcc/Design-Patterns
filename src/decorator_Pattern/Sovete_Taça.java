package decorator_Pattern;

public class Sovete_Taça extends Decorator_Recipiente {
	
	public Sovete_Taça(Sorvete sorvete)
	{
		super(sorvete);
	}
	
	public String fazer_Sorvete()
	{
		return sorvete.fazer_Sorvete() + add_Taça();
	}
	
	private String add_Taça()
	{
		return "Na Taça ";
	}
	
	public double preço_Sorvete(){
		return sorvete.preço_Sorvete();
	}
	
	
}
