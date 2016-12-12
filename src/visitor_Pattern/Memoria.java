package visitor_Pattern;

public class Memoria implements Computador_Peça {
	private int valor = 0;
	private String peça;
	private String detalhe;
	
	public Memoria(int valor,String peça,String detalhe)
	{
		this.valor = valor;
		this.detalhe = detalhe;
		this.peça = peça;
	}
	
	public String getPeça() {
		return peça;
	}

	public String getDetalhe() {
		return detalhe;
	}

	public int getValor() {
		return valor;
	}

	@Override
	   public void accept(ComputerPartVisitor computerPartVisitor) 
	{
	      computerPartVisitor.visit(this);
	}
	
}
