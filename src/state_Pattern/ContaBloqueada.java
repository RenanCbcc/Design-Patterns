package state_Pattern;

 import static javax.swing.JOptionPane.showMessageDialog;

 public class  ContaBloqueada implements ContaState  {
 private ContaBancaria conta;
 	
 	public  ContaBloqueada(ContaBancaria conta)
 	{
 		this.conta = conta;
 		
 	}
 	
 	public void Deposito( double valor)
 	{
 		this.conta.saldo+=valor;
		showMessageDialog(null,"Foi depositado R$ "+ valor);
		if ( this.conta.saldo > -1.0*this.conta.limite )
		{
			if ( this.conta.saldo > 0)
			{
				this.conta.estado = new  SaldoNegativo(this.conta);
			}
			else
			{
				this.conta.estado = new SaldoPositivo(this.conta);
			}
		}
	
 		
 	}
 	
 	public void Saque(double valor)
 	{
 		this.conta.saldo+=valor;
 		showMessageDialog(null,"Conta bloqueada, saque cancelado, saldo atual R$ "+this.conta.saldo);
 	
 	}
 	
 	public void Status(){
		showMessageDialog(null,"Conta Bloqueada");
    	}
	
 }
