package state_Pattern;

public class ContaBancaria {
	public int numero;
	public double saldo;
	public double limite;
	public ContaState estado;
	
	public ContaBancaria()
	{
		this.numero = 123456;
		this.limite = 245.00;
		this.saldo = 0;
		this.estado = null;
	}
	
	
	public ContaBancaria(int numero, double limite, double valor)
	{
		this.numero = numero;
		this.limite = limite;
		this.estado = new SaldoPositivo(this);
	}
	
	@Override
	public String toString() {
		return "ContaBancaria [numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + "]";
	}

}
