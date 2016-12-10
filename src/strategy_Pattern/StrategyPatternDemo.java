package strategy_Pattern;
import javax.swing.JOptionPane;


public class StrategyPatternDemo 
{

		
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		
		Texto texto = new Texto(new Normal());
		String palavra = "Use00";
		
		
		JOptionPane.showMessageDialog(null,"palavra: " + texto.leiaTexto(palavra));
		
		
				
	
	}

}
