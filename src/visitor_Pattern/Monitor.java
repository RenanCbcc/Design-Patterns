package visitor_Pattern;

public class Monitor implements Computador_Peça {
	private int valor = 0;
	private String peça;
	private String detalhe;
	
	
	public Monitor(int valor, String peça, String detalhe) {
		super();
		this.valor = valor;
		this.peça = peça;
		this.detalhe = detalhe;
	}


	public int getValor() {
		return valor;
	}


	public String getPeça() {
		return peça;
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
