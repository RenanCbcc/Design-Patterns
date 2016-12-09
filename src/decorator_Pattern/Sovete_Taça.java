package decorator_Pattern;

public class Sovete_Ta�a extends Decorator_Recipiente {
	
	public Sovete_Ta�a(Sorvete sorvete)
	{
		super(sorvete);
	}
	
	public String fazer_Sorvete()
	{
		return sorvete.fazer_Sorvete() + add_Ta�a();
	}
	
	private String add_Ta�a()
	{
		return "Na Ta�a ";
	}
	
	public double pre�o_Sorvete(){
		return sorvete.pre�o_Sorvete();
	}
	
	
}
