package visitor_Pattern;

public class Memoria implements Computador_Componente {
	private int valor = 0;
	private String componente;
	private String detalhe;
	
	public Memoria(int valor,String componente,String detalhe)
	{
		this.valor = valor;
		this.detalhe = detalhe;
		this.componente = componente;
	}
	
	public String getComponente() {
		return componente;
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
