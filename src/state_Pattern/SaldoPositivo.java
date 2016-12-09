package state_Pattern;

import static javax.swing.JOptionPane.showMessageDialog;

public class SaldoPositivo implements ContaState {
	private ContaBancaria conta;
	
	public SaldoPositivo(ContaBancaria conta)
	{
		this.conta = conta;
		
	}
	
	public void Deposito( double valor)
	{
		this.conta.saldo+=valor;
		showMessageDialog(null,"Foi depositado R$ "+ valor);
		if ( this.conta.saldo <0 )
		{
			if ( this.conta.saldo < -1.0*this.conta.limite)
			{
				this.conta.estado = new  ContaBloqueada(this.conta);
			}
			else
			{
				this.conta.estado = new SaldoPositivo(this.conta);
			}
		}
	}
	
	public void Saque(double valor)
	{
		this.conta.saldo -= valor;
		showMessageDialog(null,"Foi sacado R$ "+ valor);
		if (this.conta.saldo < 0)
		{
			if (this.conta.saldo < -1.0*this.conta.limite)
			{
				this.conta.estado = new  ContaBloqueada (this.conta);
		         
			}
			else
			{
				this.conta.estado = new SaldoNegativo(this.conta);
			}
		}
		
	}
	
	public void Status(){
		showMessageDialog(null,"Conta Positiva");
    	}
	
	
}
