package strategy_Pattern;
import javax.swing.JOptionPane;

public class StrategyPatternDemo 
{

		
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Texto texto;
		String[] palavras = {"norma","italico","negrito","Sublinhado"};
		
		texto = new Texto(new Normal());
		JOptionPane.showMessageDialog(null,"palavra: " + texto.excuteRender(palavras[0]));
		
		texto = new Texto(new Italico());
		JOptionPane.showMessageDialog(null,"palavra: " + texto.excuteRender(palavras[1]));
		
		texto = new Texto(new Negrito());
		JOptionPane.showMessageDialog(null,"palavra: " + texto.excuteRender(palavras[2]));
		
		texto = new Texto(new Sublinhado());
		JOptionPane.showMessageDialog(null,"palavra: " + texto.excuteRender(palavras[3]));
		
				
	
	}

}
