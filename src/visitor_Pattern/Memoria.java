package visitor_Pattern;

public class Memoria implements Computador_Pe�a {
	private int valor = 0;
	private String pe�a;
	private String detalhe;
	
	public Memoria(int valor,String pe�a,String detalhe)
	{
		this.valor = valor;
		this.detalhe = detalhe;
		this.pe�a = pe�a;
	}
	
	public String getPe�a() {
		return pe�a;
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
