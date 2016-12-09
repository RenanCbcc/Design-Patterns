package decorator_Pattern;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sorvete sorvete = new Sorvete_Pavê();
		System.out.println(sorvete.fazer_Sorvete()); 
		
		Sorvete sorvete_com_Cobertura = new Cobertura_Chocolate(sorvete);
		
		System.out.println(sorvete_com_Cobertura.fazer_Sorvete()); 
		System.out.println(sorvete_com_Cobertura.preço_Sorvete());
		
		Sorvete copinho = new Sovete_Taça(sorvete);
		System.out.println(copinho.preço_Sorvete());
		
	}

}
