package decorator_Pattern;

import javax.swing.JOptionPane;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sorvete sorvete = new Sorvete_Chocolate();
		
		JOptionPane.showMessageDialog(null,sorvete.fazer_Sorvete()); 
		
		Sorvete sorvete_com_Cobertura = new Cobertura_Chocolate(sorvete);
		
		JOptionPane.showMessageDialog(null,sorvete_com_Cobertura.fazer_Sorvete()+"\n"
				+sorvete_com_Cobertura.preço_Sorvete()); 
		
		
		Sorvete copinho = new Sovete_Taça(sorvete);
		JOptionPane.showMessageDialog(null,copinho.fazer_Sorvete()+"\n"+
				copinho.preço_Sorvete());
		
	}

}
