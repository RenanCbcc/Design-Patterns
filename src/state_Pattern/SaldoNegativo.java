package state_Pattern;

import static javax.swing.JOptionPane.showMessageDialog;

public class SaldoNegativo implements ContaState {
private ContaBancaria conta;
	
	public SaldoNegativo(ContaBancaria conta)
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
	
	
}
