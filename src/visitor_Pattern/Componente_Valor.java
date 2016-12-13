package visitor_Pattern;

import javax.swing.JOptionPane;

public class Componente_Valor implements ComputerPartVisitor{
	
		 		   
		   public void visit(Computador_Componente componente)
		   {
			   if ( componente instanceof Memoria || componente instanceof Gmemoria )
				   JOptionPane.showMessageDialog(null,"Memoria: "+componente.getDetalhe()+
						   							  "\nTipo: "+componente.getComponente()+
						   								"\ncusta: "+componente.getValor());
		   }
		   
		   
		   
		   public void visit(Computador componente)
		   {
			   String str = componente.toString();
			   JOptionPane.showMessageDialog(null,str);
		   }
		   
		   
	}


