package state_Pattern;

import static javax.swing.JOptionPane.showMessageDialog;

public class ContaBancaria {
	public int numero;
	public int saldo;
	public int limite;
	public ContaState estado;
	
	public ContaBancaria()
	{
		this.numero = 123456;
		this.limite = 245;
		this.saldo = 0;
		this.estado = new SaldoPositivo(this);
		
	}
	
	
	public ContaBancaria(int numero, int limite, int valor)
	{
		this.numero = numero;
		this.limite = limite;
		this.estado = new SaldoPositivo(this);
	}
	
	public void Saque(int valor)
	{
		this.estado.Saque(valor);
		this.estado.Status();
	}
	
	public void Deposito(int valor)
	{
		this.estado.Deposito(valor);
		this.estado.Status();
	}
	public void Status(){
		String str = 
				"Numero: " + this.numero +
				"\nSaldo: " + this.saldo+
				"\nLimite: "+ this.limite;
					
		showMessageDialog(null,str,"Dados da conta",1);
    	}
	
}
