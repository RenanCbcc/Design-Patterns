package state_Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StatePatternDemo {
	 static JFrame frame = new JFrame();
	 static String str;
	 static int valor;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        String[] opções = {"Saque", "Deposito", "Status", "Sair"};
        String user = JOptionPane.showInputDialog(null, "Digite seu nome ");
        ContaBancaria bradesco = new ContaBancaria(user,7592,1000,0); 
        
        while(true)
        {
        	String escolha = (String) JOptionPane.showInputDialog(frame, "Escolha uma opção !!!!", "Bem Vindo!", JOptionPane.QUESTION_MESSAGE, null, opções, opções[0]);
        	if (escolha == null) 
        	{
        		escolha = "0";
        	}
        	switch (escolha) 
        	{
            	case "Saque":
            		str = JOptionPane.showInputDialog(null, "Digite uma valor");
            		 valor =  Integer.parseInt( str.trim()  );
            		bradesco.Saque(valor);;
            		break;
            	case "Deposito":
            		String str = JOptionPane.showInputDialog(null, "Digite uma valor");
            		valor = Integer.parseInt( str.trim()  );
            		bradesco.Deposito(valor);;
            		break;
            	
            	case "Status":
            		bradesco.Status();
            		break;
             
            	case "Sair":
            		JOptionPane.showMessageDialog(frame, "adeus ");
            		System.exit(0);
        	}
        
        }
        
        
        

		
	}

}
