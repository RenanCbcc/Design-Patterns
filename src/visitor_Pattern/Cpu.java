package visitor_Pattern;

public class Cpu implements Computador_Pe�a {
	private int valor = 0;
	private String pe�a;
	private String detalhe;
	
	public Cpu(int valor,String pe�a,String detalhe)
	{
		this.valor = valor;
		this.detalhe = detalhe;
		this.pe�a = pe�a;
	}
	
	public int getValor() {
		return valor;
	}

	public String getPe�a() {
		return pe�a;
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
