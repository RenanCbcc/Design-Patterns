package visitor_Pattern;

public class Monitor implements Computador_Componente {
	private int valor = 0;
	private String componente;
	private String detalhe;
	
	
	public Monitor(int valor, String componente, String detalhe) {
		super();
		this.valor = valor;
		this.componente = componente;
		this.detalhe = detalhe;
	}


	public int getValor() {
		return valor;
	}


	public String getcomponente() {
		return componente;
	}


	public String getDetalhe() {
		return detalhe;
	}


	@Override
	   public void accept(ComputerPartVisitor computerPartVisitor) 
	{
	      computerPartVisitor.visit(this);
	}
	
}
