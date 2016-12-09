package decorator_Pattern;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sorvete sorvete = new Sorvete_Pav�();
		System.out.println(sorvete.fazer_Sorvete()); 
		
		Sorvete sorvete_com_Cobertura = new Cobertura_Chocolate(sorvete);
		
		System.out.println(sorvete_com_Cobertura.fazer_Sorvete()); 
		System.out.println(sorvete_com_Cobertura.pre�o_Sorvete());
		
		Sorvete copinho = new Sovete_Ta�a(sorvete);
		System.out.println(copinho.pre�o_Sorvete());
		
	}

}
