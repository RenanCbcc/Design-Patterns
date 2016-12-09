package decorator_Pattern;

public abstract class SorveteDecorator implements Sorvete {
	 protected Sorvete sorvete;
	 
	 public SorveteDecorator(Sorvete sorvete)
	 {
		 this.sorvete = sorvete;
	 }
	 
	 public String fazer_Sorvete()
	 {
		 return sorvete.fazer_Sorvete();
	 }
	 
	 
}
