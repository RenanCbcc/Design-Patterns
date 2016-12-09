package decorator_Pattern;

public abstract class Decorator_Recipiente extends SorveteDecorator {
	
	public Decorator_Recipiente(Sorvete sorvete)
	{
		super(sorvete);
	}
	
	 public String makeIcecream()
	  {
	    return sorvete.fazer_Sorvete();
	   
	  }
}
