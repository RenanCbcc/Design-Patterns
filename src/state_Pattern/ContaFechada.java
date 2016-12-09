package state_Pattern;

import static javax.swing.JOptionPane.showMessageDialog;

public class ContaFechada implements ContaState  {
private ContaBancaria conta;
	
	public ContaFechada(ContaBancaria conta)
	{
		this.conta = conta;
		
	}
	
	public void Deposito( double valor)
	{
		this.conta.saldo+=valor;
		showMessageDialog(null,"Foi depositado R$ "+ valor);
	
	}
	
	public void Saque(double valor)
	{
		this.conta.saldo-=valor;
		showMessageDialog(null,"Foi depositado R$ "+ valor);
	
	}
	
	public String toString(){
    	return "Conta Fechada";
    	}
	
}
