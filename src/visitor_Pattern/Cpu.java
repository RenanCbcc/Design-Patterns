package visitor_Pattern;

public class Cpu implements Computador_Componente {
	private int valor = 0;
	private String componente;
	private String detalhe;
	
	public Cpu(int valor,String pe�a,String detalhe)
	{
		this.valor = valor;
		this.detalhe = detalhe;
		this.componente = pe�a;
	}
	
	public int getValor() {
		return valor;
	}

	public String getComponente() {
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
